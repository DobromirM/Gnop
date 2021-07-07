import React, {Component} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import "./App.css";

import PaddleLeft from "./components/PaddleLeft/PaddleLeft";
import PaddleRight from "./components/PaddleRight/PaddleRight";
import Ball from "./components/Ball/Ball";


class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            leftPaddlePos: 30,
            rightPaddlePos: 30
        }
    }

    ws = new WebSocket('ws://localhost:8080');

    componentDidMount() {
        this.ws.onopen = () => {
            console.log("connected")
        }

        this.getPosition()

        this.ws.onclose = () => {
            console.log('disconnected')
        }
    }

    sendData = () => {
        try {
            this.ws.send(this.state.leftPaddlePos)
        } catch (error) {
            console.log(error)
        }
    }

    getPosition = () => {
        this.ws.onmessage = (evt) => {
            let newPos = parseInt(evt.data)
            this.setState({
                leftPaddlePos: newPos
            })
        }

        console.log(this.state.leftPaddlePos)
    }

    render() {
        return (
            <div className="App container d-flex justify-content-between align-items-center">
                <PaddleLeft move={this.sendData} pos={this.state.leftPaddlePos} />
                <Ball/>
                <PaddleRight pos={this.state.rightPaddlePos} />
            </div>
        );
    }
}

export default App;
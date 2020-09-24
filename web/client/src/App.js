import React, {Component} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import "./App.css";

import Paddle from "./components/Paddle/Paddle";
import Ball from "./components/Ball/Ball";


const keys = {
    left: {
        up: "w",
        down: "s"
    },
    right: {
        up: "ArrowUp",
        down: "ArrowDown"
    },
    ball: {
        up: "8",
        down: "5"
    }
}

class App extends Component {



    state = {
        playAreaBoundaries: {
            // initial values for front end
            top: 0,
            bottom: 60,
            left: 0,
            right: 100
        }
    }

    render() {
        return (
            <div className="App container d-flex justify-content-between align-items-center">
                <Paddle boundary={this.state.playAreaBoundaries} keyUp={keys.left.up} keyDown={keys.left.down}/>
                <Ball boundary={this.state.playAreaBoundaries} keyUp={keys.ball.up} keyDown={keys.ball.down}/>
                <Paddle boundary={this.state.playAreaBoundaries} keyUp={keys.right.up} keyDown={keys.right.down}/>
            </div>
        );
    }
}

export default App;
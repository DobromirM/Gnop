import React, {Component} from 'react';
import "./PaddleLeft.css";

class PaddleLeft extends Component {
    state = {
        pos: 30
    }

    move = (event) => {
        if(event.key === "w" && this.state.pos > 0) {
            this.setState({
                pos: this.state.pos - 1
            })
        }
        if (event.key === "s" && this.state.pos < 60) {
            this.setState({
                pos: this.state.pos + 1
            })
        }
    }

    componentDidMount() {
        document.addEventListener("keydown", this.move, false);
    }

    componentWillUnmount() {
        document.removeEventListener("keydown", this.move, false);
    }

    render() {
        return (
            <div className="paddleLeft-box">
                <div className="paddleLeft" style={{margin: this.state.pos + "vh 0 0 0"}}>

                </div>
            </div>
        );
    }
}

export default PaddleLeft;
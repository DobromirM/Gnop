import React, {Component} from 'react';
import "./Paddle.css";

class PaddleLeft extends Component {
    state = {
        pos: 30,
        velocity: 1
    }

    move = (event) => {
        if(event.key === this.props.keyUp && this.state.pos > this.props.boundary.top) {
            this.setState({
                pos: this.state.pos - this.state.velocity
            })
        }
        if (event.key === this.props.keyDown && this.state.pos < this.props.boundary.bottom) {
            this.setState({
                pos: this.state.pos + this.state.velocity
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
            <div className="paddle-box">
                <div className="paddle" style={{margin: this.state.pos + "vh 0 0 0"}}>

                </div>
            </div>
        );
    }
}

export default PaddleLeft;
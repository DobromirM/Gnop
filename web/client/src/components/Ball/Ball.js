import React, {Component, isValidElement, useEffect} from 'react';
import "./Ball.css";

class Ball extends Component {
    state = {
        xPosition: 30,
        yPosition: 30,
        velocity: 1
    }

    moveBallHorizontal = () => {
        this.setState({
            // ball will recieve x position from the server
            xPosition: this.state.xPosition
        })
    }

    move = (event) => {
        if(event.key === this.props.keyUp && this.state.yPosition > this.props.boundary.top) {
            this.setState({
                yPosition: this.state.yPosition - this.state.velocity
            })
        }
        if (event.key === this.props.keyDown && this.state.yPosition < this.props.boundary.bottom) {
            this.setState({
                yPosition: this.state.yPosition + this.state.velocity
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
            <div className="ball-box">
                <div className="ball" style={{margin: this.state.yPosition + "vh " + "0" + "vh" + " 0 " + this.state.xPosition + "vh"}} />
            </div>
        );
    }
}

export default Ball;
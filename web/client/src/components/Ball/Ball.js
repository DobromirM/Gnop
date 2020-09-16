import React, {Component, useEffect} from 'react';
import "./Ball.css";

class Ball extends Component {
    state = {
        LPos: 30,
        RPos: 0
    }

    moveBall = () => {
        this.setState({
            LPos: this.state.LPos + 1
        })
    }

    render() {
        return (
            <div className="ball-box">
                <div className="ball" style={{margin: "30vh " + this.state.RPos + "vh" + " 0 " + this.state.LPos + "vh"}}></div>
            </div>
        );
    }
}

export default Ball;
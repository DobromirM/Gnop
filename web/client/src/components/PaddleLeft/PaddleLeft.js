import React, {Component} from 'react';
import "./PaddleLeft.css";

class PaddleLeft extends Component {
    move = (event) => {
        if(event.key === "w" && this.props.pos > 0) {
            this.props.move()
        }
        if (event.key === "s" && this.props.pos < 60) {

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
                <div className="paddleLeft" style={{margin: this.props.pos + "vh 0 0 0"}}>

                </div>
            </div>
        );
    }
}

export default PaddleLeft;
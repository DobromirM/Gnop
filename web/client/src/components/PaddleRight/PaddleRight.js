import React, {Component} from 'react';
import "./PaddleRight.css";

class PaddleRight extends Component {
    state = {
        pos: this.props.pos
    }

    move = (event) => {
        if(event.keyCode === 38 && this.state.pos > 0) {
            this.setState({
                pos: this.state.pos - 1
            })
        }
        if (event.keyCode === 40 && this.state.pos < 60) {
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
            <div className="paddleRight-box">
                <div className="paddleRight" style={{margin: this.state.pos + "vh 0 0 0"}}>

                </div>
            </div>
        );
    }
}

export default PaddleRight;
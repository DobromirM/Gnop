import React, {Component} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import "./App.css";

import PaddleLeft from "./components/PaddleLeft/PaddleLeft";
import PaddleRight from "./components/PaddleRight/PaddleRight";
import Ball from "./components/Ball/Ball";


class App extends Component {
    render() {
        return (
            <div className="App container d-flex justify-content-between align-items-center">
                <PaddleLeft />
                <Ball/>
                <PaddleRight />
            </div>
        );
    }
}

export default App;
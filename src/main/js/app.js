'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');

import HomePage from './components/HomePage.js'
import { Router, Route, hashHistory, IndexRoute } from 'react-router'

// end::vars[]

// tag::accueil[]
class Login extends React.Component {
    render() {
        return(
            <HomePage />
        )
      }
}
//end:accueil[]

// tag::render[]
ReactDOM.render(
    <Login />,
    document.getElementById('accueil')
);
// end::render[]

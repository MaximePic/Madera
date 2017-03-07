'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import Login from './components/Login.js'
import { Router, Route, hashHistory, IndexRoute } from 'react-router'

//Composant Login dans login.html
ReactDOM.render(
    <Login />,
    document.getElementById('loginForm')
);

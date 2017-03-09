'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import { Router, Route, hashHistory, IndexRoute } from 'react-router'

import ProjectList from './components/project/ProjectList.js'


ReactDOM.render(
    <ProjectList/>,
    document.getElementById('projectList')
);

'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import ProjectList from './components/project/ProjectList.js'
import DevisList from './components/devis/DevisList.js'
import DevisDetails from './components/devis/DevisDetails.js'

const projectList = document.getElementById('projectList');
const devisList = document.getElementById('devisList');
const devis = document.getElementById('devis');

if(projectList) {
    ReactDOM.render(
        <ProjectList/>,
        projectList
    );
}

if(devisList){
    ReactDOM.render(
        <DevisList/>,
        devisList
    );
}

if(devis){
    ReactDOM.render(
        <DevisDetails/>,
        devis
    );
}
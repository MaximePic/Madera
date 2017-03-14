'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import Project from './Project'
import * as dateConverter from '../../../resources/utils/dateConverter.js'

class ProjectList extends React.Component{
    constructor() {
        super();
        this.state = { projectList: [] };
    }

    componentDidMount() {
        fetch(`/api/getCommercialProjectList`,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            }).then(response => response.json())
            .then(projectList => {
                this.setState({projectList});
            });
    }
    render(){
        return(
            <div>
                <div>Liste des projets: </div>
                {this.state.projectList.map(project=> {
                    //Convertion de la date en format JSON
                    project[1] = dateConverter.convertDate(project[1]);
                    return <Project key={project.id} project={project}/>
                })}
            </div>
        )
    }
}

export default ProjectList;
'use strict';

const React = require('react');
const ReactDOM = require('react-dom');


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
                {this.state.projectList.map(project=> {return <div key={project.id}>{project.nom}</div>})}
            </div>
        )
    }
}

export default ProjectList;
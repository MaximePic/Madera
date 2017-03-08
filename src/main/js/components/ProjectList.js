'use strict';

const React = require('react');
const ReactDOM = require('react-dom');


class ProjectList extends React.Component{
    constructor() {
        super();
        this.state = { projectList: [] };
    }

    componentDidMount() {
        fetch(`/getCommercialProjectList`,
            {
                method: 'get',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
            })
            .then(function (response) {
                console.log(response);
                console.log(response.json())
            });
    }
    render(){
        return(
            <div>
                <div>Liste des projets: </div>
            </div>
        )
    }
}

export default ProjectList;
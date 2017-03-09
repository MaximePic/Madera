'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import * as projectConstants from '../../../resources/utils/projectConstants.js'


class Project extends React.Component{

    render(){
        console.log();
        return(
            <div className="project">
                {Object.keys(this.props.project).map(data=>{
                    console.log(data);
                    return <ProjectData label={data} values={this.props.project[data]} index={arguments[1]}/>
                })}
            </div>
        )
    }
}

function ProjectData(props){
    var label = "";
    switch (props.label){
        case projectConstants.ID:
            label = projectConstants.PROJECT_ID_FR;
            break;
        case projectConstants.NAME:
            label = projectConstants.PROJECT_NAME_FR;
            break;
        case projectConstants.CREATION_DATE:
            label = projectConstants.CREATION_DATE_FR;
            break;
        case projectConstants.COMMERCIAL_ID:
            label = projectConstants.COMMERCIAL_FR;
            break;
        case projectConstants.CLIENT_ID:
            label = projectConstants.CLIENT_FR;
            break;
        default:
            label = projectConstants.NULL;
            break;
    }
    return (
        <div>
            <div className="projectLabel">{label}</div>
            <div>{props.values}</div>
        </div>
    )
}

export default Project;
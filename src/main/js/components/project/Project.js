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
        case "0":
            label = projectConstants.PROJECT_NAME_FR;
            break;
        case "1":
            label = projectConstants.CREATION_DATE_FR;
            break;
        case "2":
            label = projectConstants.COMMERCIAL_FR;
            break;
        case "3":
            label = projectConstants.CLIENT_FR;
            break;
        case "4":
            label = projectConstants.ID;
            break;
        default:
            label = projectConstants.NULL;
            break;
    }
    if(label !== projectConstants.ID) {
        return (
            <div>
                <div className="projectLabel">{label}</div>
                <div>{props.values}</div>
            </div>
        )
    }else{
        return(
            <a href={'/projet/' + props.values}>Voir le projet</a>
        )
    }
}

export default Project;
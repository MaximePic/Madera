'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import * as devisConstants from '../../../resources/utils/devisConstants.js'

class Devis extends React.Component{

    render(){
        return(
            <div className="devis">
                {Object.keys(this.props.devis).map(data=>{
                    return <DevisData label={data} values={this.props.devis[data]} index={arguments[1]}/>
                })}
            </div>
        )
    }
}

function DevisData(props){
    var label = "";
    switch (props.label){
        case "0":
            label = devisConstants.NAME_FR;
            break;
        case "1":
            label = devisConstants.CREATION_DATE_FR;
            break;
        case "2":
            label = devisConstants.STATE_FR;
            break;
        case "3":
            label = devisConstants.ID;
            break;
        default:
            label = devisConstants.NULL;
            break;
    }
    if(label !== devisConstants.ID) {
        return (
            <div>
                <div className="devisLabel">{label}</div>
                <div>{props.values}</div>
            </div>
        )
    }else{
        return(
            <a href={'/devis/' + props.values}>Voir le devis</a>
        )
    }
}

export default Devis;
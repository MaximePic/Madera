'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import Devis from  './Devis.js'
import * as dateConverter from '../../../resources/utils/dateConverter.js'

class DevisList extends React.Component{
    constructor() {
        super();
        this.state = { devisList: [] };
    }

    componentDidMount() {
        fetch(`/api/getDevisList`,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            }).then(response => response.json())
            .then(devisList => {
                this.setState({devisList});
            });
    }
    render(){
        return(
            <div>
                <div>Liste des devis: </div>
                {this.state.devisList.map(devis=> {
                    //Convertion de la date en format JSON
                    devis[1] = dateConverter.convertDate(devis[1]);
                    return <Devis key={devis.id} devis={devis}/>
                })}
            </div>
        )
    }
}

export default DevisList;
'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import Devis from  './Devis.js'

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
                    return <Devis key={devis.id} devis={devis}/>
                })}
            </div>
        )
    }
}

export default DevisList;
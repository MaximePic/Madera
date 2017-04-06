'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

import * as urlParameterService from '../../../resources/utils/urlParameter'

const pageMode = urlParameterService.getParameterByName('mode');

class DevisDetails extends React.Component{
    constructor() {
        super();
        this.state = { devis: {}};
    }

    componentDidMount() {
        fetch(`/api/getDevisDetails`,
            {
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            }).then(response => response.json())
            .then(devis => {
                this.setState({devis});
            });
    }

    //Sauvegarde le devis en appelant l'api saveDEvisDetails
    saveDevis(devis) {
        this.saveDevisDetails(devis);
        fetch(`/api/saveDevisDetails`,
            {
                method: 'POST',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(devis)
            }).then(function(res){
                return res.json();
            })
    }

    //Sauvegarde toutes les informations du devis
    saveDevisDetails(devis){
        devis.nom = this.name.value;
    }

    render(){
        if(pageMode === 'edit'){
            return(
                <div>
                    <div>
                        Nom du devis:
                        <input type="text" name="devisName"
                               defaultValue={this.state.devis.nom}
                               ref={(input) => this.name = input}/>
                    </div>
                    <div>
                        Etat du devis:
                        <span>{this.state.devis.etat}</span>
                    </div>
                    <div>
                        Total HT:
                        <span>{this.state.devis.totalHT}</span>
                    </div>
                    <div>
                        TVA:
                        <span>{this.state.devis.tva} %</span>
                    </div>
                    <button type="button" onClick={() => this.saveDevis(this.state.devis)}>Save</button>
                </div>

            )
        }else{
            return(
                <div>
                    <div>
                        Nom du devis:
                        <span> {this.state.devis.nom}</span>
                    </div>
                    <div>
                        Etat du devis:
                        <span>{this.state.devis.etat}</span>
                    </div>
                    <div>
                        Total HT:
                        <span>{this.state.devis.totalHT}</span>
                    </div>
                    <div>
                        TVA:
                        <span>{this.state.devis.tva} %</span>
                    </div>
                </div>
            )
        }
    }
}

export default DevisDetails;
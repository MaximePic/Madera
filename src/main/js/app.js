'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {commerciaux: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/commerciaux'}).done(response => {
            this.setState({commerciaux: response.entity._embedded.commerciaux});
        });
    }

    render() {
        return (
            <CommercialList commerciaux={this.state.commerciaux}/>
        )
    }
}
// end::app[]

// tag::employee-list[]
class CommercialList extends React.Component{
    render() {
        var commerciaux = this.props.commerciaux.map(commercial =>
            <Employee key={commercial._links.self.href} commercial={commercial}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                </tr>
                {commerciaux}
                </tbody>
            </table>
        )
    }
}
// end::employee-list[]

// tag::employee[]
class Employee extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}
// end::employee[]

// tag::render[]
ReactDOM.render(
    <App />,
    document.getElementById('react')
);
// end::render[]


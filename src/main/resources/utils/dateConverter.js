'use strict'

/**
 * Fonction permettant de convertir une date de Timestamp au format JSON
 */
export function convertDate(date) {
    var date = new Date(date);
    var formattedDate = date.getDate() + "/" + (date.getMonth() + 1) + "/" + date.getFullYear();
    return formattedDate;
}
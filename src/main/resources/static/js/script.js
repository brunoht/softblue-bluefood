function isNumberKey(event) {
    let charCode = (event.which) ? event.which : event.keyCode
    console.log(charCode)
    if ((charCode >= 48 && charCode <= 57) || (charCode >= 96 && charCode <= 105)) {
        return true
    }
    return false
}
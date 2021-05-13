document.addEventListener("DOMContentLoaded", function(){
    init()

    function init() {
        addOptions()
        addEvents()
    }

    function addOptions() {
        let homeSize = document.getElementById('homeSize')
        let options = document.createDocumentFragment()

        for (let i = 1; i <= 100; i++) {
            let option = document.createElement('option')
            option.innerText = i + '평'
            option.value = i + '';
            options.append(option)
        }

        homeSize.append(options)
    }

    function addEvents() {
        addClickEventByClassname('prevBtn', previous)
        addClickEventByClassname('nextBtn', next)

        document.getElementById('apply').addEventListener('click', apply)
    }

    function addClickEventByClassname(className, f) {
        let elements = document.querySelectorAll('.' + className)

        for (let i = 0; i < elements.length; i++) {
            elements[i].addEventListener('click', f)
        }
    }

    function previous(e) {
        let value = Number(e.target.value)
        document.getElementById('area-' + value).style.display = 'none'
        document.getElementById('area-' + (value - 1)).style.display = 'block'
    }

    function next(e) {
        let value = Number(e.target.value)
        document.getElementById('area-' + value).style.display = 'none'
        document.getElementById('area-' + (value + 1)).style.display = 'block'
    }

    function apply() {
        let myHeaders = new Headers();
        myHeaders.append("Content-Type", "application/json");

        let selectOption = document.getElementById('homeSize')
        let selectedHomeSize = selectOption.options[selectOption.selectedIndex].value
        let startDate = document.getElementById('startDate').value + 'T00:00:00.000000'
        let endDate = document.getElementById('endDate').value + 'T00:00:00.000000'
        let requirements = document.getElementById('requirements').innerText

        let raw = JSON.stringify({
            "writerId": "test",
            "homeSize": selectedHomeSize,
            "startDate": startDate,
            "endDate": endDate,
            "requirements": requirements
        });

        let requestOptions = {
            method: 'POST',
            headers: myHeaders,
            body: raw,
            redirect: 'follow'
        };

        fetch("http://localhost:8080/write", requestOptions)
            .then(response => response.text())
            .then(result => console.log(result))
            .catch(error => console.log('error', error));
    }
});
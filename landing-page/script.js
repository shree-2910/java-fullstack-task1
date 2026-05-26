document.getElementById("contactForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const formData = new URLSearchParams();

    formData.append(
        "name",
        document.getElementById("name").value
    );

    formData.append(
        "email",
        document.getElementById("email").value
    );

    formData.append(
        "message",
        document.getElementById("message").value
    );

    const response = await fetch(
        "http://localhost:8080/contact",
        {
            method:"POST",
            body:formData
        }
    );

    const result = await response.text();

    document.getElementById("response")
        .innerText = result;
});
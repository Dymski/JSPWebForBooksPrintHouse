<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.6">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Site Metas -->
    <title>BookPrintHouse</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="apple-touch-icon" href="/docs/4.4/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/4.4/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/4.4/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
    <link rel="icon" href="/docs/4.4/assets/img/favicons/favicon.ico">
    <meta name="msapplication-config" content="/docs/4.4/assets/img/favicons/browserconfig.xml">
    <meta name="theme-color" content="#563d7c">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- Site CSS -->
    <link rel="stylesheet" href="components/style.css" type="text/css" media="all">
    <!-- Responsive CSS -->
    <%--    <link rel="stylesheet" href="css/responsive.css">--%>
    <!-- Custom CSS -->
    <%--    <link rel="stylesheet" href="css/custom.css">--%>

    <!-- Custom styles for this template -->
    <style>
        <%--
        In order to overwrite styles -> in file styles
        body {background-color: powderblue;}
        h1   {color: blue;}
        p    {color: red;}

        to owervirte in file styles -> you can still use in line styles:
        <h1 style="color:blue;">This is a Blue Heading</h1>
        --%>

        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }


    </style>


</head>
<body>
<%@include file="components/navbar.jsp" %>
<%@include file="components/carousel.jsp" %>
<div class="container">
    <br/>
    <hr class="featurette-divider">

    <div class="container form-group col-md-4">

        <br/>

        <h3 align="center">Create account</h3>
        <br/>

        <form method="post" action=""
        oninput='password2.setCustomValidity(password2.value != password.value ? "Passwords do not match." : "")'>
            <div class="form-group">
                <label for="email">Email address</label>
                <input type="email" class="form-control" id="email" aria-describedby="emailHelp"
                       placeholder="email@example.com" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="password2">Re-type password</label>
                <input type="password" class="form-control" id="password2" name="password2" required>
            </div>
            <div class="form-group">
                <label for="companyName">Company name</label>
                <input type="text" class="form-control" id="companyName" name="companyName" required>
            </div>
            <div class="form-group">
                <label for="taxIdentificationNumber">Tax identification number</label>
                <input type="text" class="form-control" id="taxIdentificationNumber" name="taxIdentificationNumber" required>
            </div>
            <div class="form-group">
                <label for="secretQuestion">Secret question</label>
                <input type="text" class="form-control" id="secretQuestion" name="secretQuestion" required>
            </div>
            <div class="form-group">
                <label for="secretAnswer">Secret answer</label>
                <input type="text" class="form-control" id="secretAnswer" name="secretAnswer" required>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="newsletterAgreement" name="newsletterAgreement">
                <label class="form-check-label" for="newsletterAgreement">
                    Sign me for newsletter!
                </label>
            </div>
            <br/>
            <input type="submit" value="Submit" class="btn btn-primary">
        </form>
    </div>
</div>

<br/>
<hr class="container featurette-divider">
<br/>
<%@include file="components/footer.jsp" %>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
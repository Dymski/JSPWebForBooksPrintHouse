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

        p {
            text-align: center;
        }


    </style>


</head>
<body>
<%@include file="components/navbar.jsp" %>
<%@include file="components/carousel.jsp" %>
<div class="container">
<br/>     <hr class="featurette-divider"> <br/>

    <p><i>
        The term "book printing" is applied in historical context and the dictionaries describe it as the process for
        reproducing text and image,
        typically with ink on paper using a printing press. The printing was, so to say, invented two times: first in
        China and then in Europe in the Middle Ages.
        Woodblock printing became widely spread in China. The wood block was prepared as a relief matrix. The block was
        cut along the grain of the wood.
        Among the books executed in this technique the so-called Ars Grammatica (Latin grammar by Aelius Donatus) is the
        most well-known one.
        As for the inventor of book printing, there is no single opinion. One of the most popular versions implies it
        was Johannes Gutenberg:
        this German craftsman invented the first printing press in late 1400's.
        The principle of its work lies in the usage of a movable type (the metal type pieces with the printed signs
        engraved on them).
        The press combined the principle of die stamping and woodblock printing.
        The invention rapidly gained popularity in Italian cities. The masters from Venice worked out a new typeface
        which was called Antiqua or Venetian Font.
        Thus, book printing is becoming more popular in Western Europe. At that time a lot of religious books were
        issued.
        The number of typographies was increasing in all European countries, except for Germany; they were even trying
        to reduce the number of typographies.
        For instance, the Sorbonne administration spoke out against the outspread of book printing.
        A prominent 14th century book printer Aldo Manuci owned the famous Venetian typography, the Aldo's Typography,
        which managed to issue about one thousand books for 100 years.
        What had earlier been handwritten was printed then. However, invention of book printing was not the end for the
        written books.
        Moreover, the scribes worked out even more elaborate and exquisite writing fonts.
        Later one of those styles was used for execution of official papers; it was taught at the universities, that
        manner became known as calligraphic handwriting.
        Nowadays most texts are printed. Nevertheless, a lot of people became interested in the art of calligraphy, and
        it is undoubtedly a good tendency.</i></p>
</div>
<br/>
<div class="container" style="text-align: center">
    <h3>Sign in or create your account</h3>
    <h4>If you wish to <a href="place_order.jsp">order book prints.</a></h4>
</div>
<br/>
<div class="container" style="text-align-last: center">
    <a href="sign_in.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true" style="text-align: center">Sign In</a>
    <a href="create_account.jsp" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true" style="alignment: center">Create Account</a>


<br/> <br/>
    <hr class="featurette-divider">
</div>
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
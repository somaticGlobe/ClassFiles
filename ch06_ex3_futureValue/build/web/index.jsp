<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
    <c:import url ="/header.jsp"/>
    <body>
        <section>
            <h1>Future Value Calculator</h1>
            <p><i>${message}</i></p>
            <form action="calculate" method="post">
                <label>Investment Amount:</label>
                <input type="text" name="investment"
                       value="${calculation.monthlyInvestmentAmount}"/><br>

                <label>Yearly Interest Rate:</label>
                <input type="text" name="interest_rate"
                       value="${calculation.yearlyInterestRate}"/><br>

                <label>Number of Years:</label>
                <input type="text" name="years"
                       value="${calculation.years}"/><br>

                <label>&nbsp;</label>
                <input type="submit" value="Calculate"/><br>
            </form>
        </section>
    <c:import url = "/footer.jsp"/>
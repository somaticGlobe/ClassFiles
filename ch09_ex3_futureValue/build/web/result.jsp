<%@include file="header.jsp" %>
<section>
    <h1>Future Value Calculator</h1>

    <label>Investment Amount:</label>
    <span>${calculation.monthlyInvestmentAmountCurrencyFormat}</span><br />

    <label>Yearly Interest Rate:</label>
    <span>${calculation.yearlyInterestRate}</span><br />

    <label>Number of Years:</label>
    <span>${calculation.years}</span><br />

    <label>Future Value:</label>
    <c:forEach var ="calculation" items ="${calculations.calculation}">
        <c:out value ="${calculations.calculation}"/>
        <tr>
            <td>${calculation.getYears}</td>
            <td>${calculation.getMonthlyInvestmentAmount}</td>
        </tr>
    </c:forEach>
    <span>${calculation.futureValueCurrencyFormat}</span><br />

    <label>&nbsp;</label>
    <span><a href="index.jsp">Return to Calculator</a></span>
</section>
<%@include file="footer.jsp" %>

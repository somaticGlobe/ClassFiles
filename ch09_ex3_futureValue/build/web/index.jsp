<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<section>
    <h1>Future Value Calculator</h1>
    <p><i>${message}</i></p>
    <form action="calculate" method="post">
        <label>Investment Amount:</label>
        <c:choose>
            <c:when test="${investment != null}">
                    <input type="text" name="investment"
                           value="${investment}"/><br>
            </c:when>
            <c:otherwise>
                    <input type="text" name="investment"
                           value="${calculation.monthlyInvestmentAmount}"/><br>
            </c:otherwise>
        </c:choose>
        <label>Yearly Interest Rate:</label>
        <c:choose>
            <c:when test="${interestRate != null}">
                <input type="text" name="interest_rate"
                       value="${interestRate}"/><br>
            </c:when>
            <c:otherwise>
                <input type="text" name="interest_rate"
                       value="${calculation.yearlyInterestRate}"/><br>
            </c:otherwise>
        </c:choose>
        <label>Number of Years:</label>
        <input type="text" name="years"
               value="${calculation.years}"/><br>

        <label>&nbsp;</label>
        <input type="submit" value="Calculate"/><br>
    </form>
</section>
<%@include file="footer.jsp" %>
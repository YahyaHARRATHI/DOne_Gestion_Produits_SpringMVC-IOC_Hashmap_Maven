<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<head>
	<title>Catalogue</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/Style.css">
</head>
<body>
<div id="formProduit">
<!--  form de Spring basé sur un model (Produit) 
crée dans le controleur homecontroller(catalogueController)-->

<f:form modelAttribute="produit" method="post" action="saveProduit">
<table>
<tr>
<td>Référence :</td>
<!-- PATH is used for Data binding -->
<td><f:input path="reference"  autocomplete="${ptomodify.reference}"/></td>
<td><f:errors cssClass="error" path="reference"/></td>
</tr>

<tr>
<td>Designation :</td>

<!-- input text=produit.designation par default (s'il ya une 
	et la donnée saisie va etre stocker dans produit.

 -->

<td><f:input path="designation"/><c:out value="${ptomodify.designation }"></c:out></td>
<td><f:errors cssClass="error" path="designation"/></td>
</tr>

<tr>
<td>Prix :</td>
<td><f:input path="prix"/><c:out value="${ptomodify.prix }"></c:out></td>
<td><f:errors cssClass="error" path="prix"/></td>
</tr>

<tr>
<td>Quantité :</td>
<td><f:input path="quantite"/><c:out value="${ptomodify.quantite }"></c:out></td>
<td><f:errors cssClass="error" path="quantite"/></td>
</tr>

<tr>
<td><input type="submit" value="Save"/></td>
</tr>
</table>
</f:form>
</div>

<div id="listproduits">
<table class="table1">
<tr>
<th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QAUNTITE</th>
</tr>
<c:forEach items="${produits}" var="p">
  <tr>
  <td>${p.reference}</td>
  <td>${p.designation}</td>
  <td>${p.prix}</td>
  <td>${p.quantite }</td>
  <td><a href="supprimer?ref=${p.reference}">Supprimer</a></td>
  <td><a href="modifier?ref=${p.reference }">Modifier</a></td>
  </tr>
</c:forEach>
</table>
</div>

</body>
</html>

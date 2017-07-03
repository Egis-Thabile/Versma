def parentPath = doc.node.node.parentNode.fullPath
def Amendment_Group = doc.workflow().get('Amendment_Group')

if ( Amendment_Group == "Amendments Commercial") {
    doc.moveTo(parentPath + "/" + Amendment_Group + "/" + "Commercial Amend Docs")
}

if (Amendment_Group == "Amendments Domestic") {
    doc.moveTo(parentPath + "/" + Amendment_Group + "/" + "Domestic Amend Docs")
}

if (Amendment_Group == "Amendments Santam Commercial") {
    doc.moveTo(parentPath + "/" + Amendment_Group + "/" + "Santam Commercial Amend Docs")
}

if (Amendment_Group == "Amendments Santam Domestic") {
    doc.moveTo(parentPath + "/" + Amendment_Group + "/" + "Santam Domestic Amend Docs")
}

doc.save()
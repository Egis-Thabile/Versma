def path = doc.node.node.parentNode.fullPath

if (doc.workflow().get('Amendment_Group') == "Amendments Commercial") {
    doc.moveTo(path.substring(0, path.lastIndexOf('/')) + "/" + doc.workflow().get('Amendment_Group') + "/" + "Commercial Amend Docs")
}

if (doc.workflow().get('Amendment_Group') == "Amendments Domestic") {
    doc.moveTo(path.substring(0, path.lastIndexOf('/')) + "/" + doc.workflow().get('Amendment_Group') + "/" + "Domestic Amend Docs")
}

if (doc.workflow().get('Amendment_Group') == "Amendments Santam Commercial") {
    doc.moveTo(path.substring(0, path.lastIndexOf('/')) + "/" + doc.workflow().get('Amendment_Group') + "/" + "Santam Commercial Amend Docs")
}

if (doc.workflow().get('Amendment_Group') == "Amendments Santam Domestic") {
    doc.moveTo(path.substring(0, path.lastIndexOf('/')) + "/" + doc.workflow().get('Amendment_Group') + "/" + "Santam Domestic Amend Docs")
}

doc.save()
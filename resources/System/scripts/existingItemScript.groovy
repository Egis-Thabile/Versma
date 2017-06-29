import com.egis.utils.ValidationUtils
import com.egis.kernel.Kernel
import com.egis.Session

Session s = Kernel.get(Session.class);

def path = doc.node.node.parentNode.fullPath
def pathUp = path.substring(0, path.lastIndexOf('/'))
def commonPath = pathUp.substring(pathUp.lastIndexOf('/') + 1, pathUp.length())
def supDocNode = ''

if (commonPath == 'Amendments Commercial') {
    supDocNode = 'Commercial Amend Docs'
}

if (commonPath == 'Amendments Domestic') {
    supDocNode = 'Domestic Amend Docs'
}

if (commonPath == 'Amendments Santam Commercial') {
    supDocNode = 'Santam Commercial Amend Docs'
}

if (commonPath == 'Amendments Santam Domestic') {
    supDocNode = 'Santam Domestic Amend Docs'
}

def existingItem = s.getDocument("SELECT Issue_No FROM '" + pathUp + '/' + supDocNode + "' WHERE Issue_No='"+doc.workflow().get('Issue_No')+"'")

ValidationUtils.notNull(existingItem, "Please Link Existing Items")

doc.save()
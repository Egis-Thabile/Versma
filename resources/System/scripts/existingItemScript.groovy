import com.egis.utils.ValidationUtils
import com.egis.kernel.Kernel
import com.egis.Session

Session s = Kernel.get(Session.class);

def path = doc.node.node.parentNode.fullPath
def parentPath = doc.node.node.parentNode.parentNode.fullPath
def parentNode = path.split('/')[-1]
def supDocNode = ''

if (parentNode == 'Amendments Commercial') {
    supDocNode = 'Commercial Amend Docs'
}

if (parentNode == 'Amendments Domestic') {
    supDocNode = 'Domestic Amend Docs'
}

if (parentNode == 'Amendments Santam Commercial') {
    supDocNode = 'Santam Commercial Amend Docs'
}

if (parentNode == 'Amendments Santam Domestic') {
    supDocNode = 'Santam Domestic Amend Docs'
}

def existingItem = s.getDocument("SELECT Issue_No FROM '" + parentPath + '/' + supDocNode + "' WHERE Issue_No='"+doc.workflow().get('Issue_No')+"'")

ValidationUtils.notNull(existingItem, "Please Link Existing Items")

doc.save()
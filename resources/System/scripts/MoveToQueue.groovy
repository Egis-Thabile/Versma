import com.egis.kernel.Kernel
import com.egis.kernel.db.DbManager

DbManager db = Kernel.get(DbManager.class)

def path = doc.node.getFullPath()

doc.moveTo(db.resolve(path.substring(0, path.lastIndexOf('/')) + doc.workflow().get('Amendment_Group')))

doc.save()
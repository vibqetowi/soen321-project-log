package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
/* loaded from: classes.dex */
public class AckUserWrite extends Operation {
    private final ImmutableTree<Boolean> affectedTree;
    private final boolean revert;

    public AckUserWrite(Path path, ImmutableTree<Boolean> immutableTree, boolean z10) {
        super(Operation.OperationType.AckUserWrite, OperationSource.USER, path);
        this.affectedTree = immutableTree;
        this.revert = z10;
    }

    public ImmutableTree<Boolean> getAffectedTree() {
        return this.affectedTree;
    }

    public boolean isRevert() {
        return this.revert;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public Operation operationForChild(ChildKey childKey) {
        if (!this.path.isEmpty()) {
            Utilities.hardAssert(this.path.getFront().equals(childKey), "operationForChild called for unrelated child.");
            return new AckUserWrite(this.path.popFront(), this.affectedTree, this.revert);
        } else if (this.affectedTree.getValue() != null) {
            Utilities.hardAssert(this.affectedTree.getChildren().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new AckUserWrite(Path.getEmptyPath(), this.affectedTree.subtree(new Path(childKey)), this.revert);
        }
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", getPath(), Boolean.valueOf(this.revert), this.affectedTree);
    }
}

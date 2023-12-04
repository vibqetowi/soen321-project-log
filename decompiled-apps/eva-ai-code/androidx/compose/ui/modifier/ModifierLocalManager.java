package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ModifierLocalManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0012J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u001b\u001a\u00020\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroidx/compose/ui/node/Owner;)V", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "insertedLocal", "Landroidx/compose/ui/modifier/ModifierLocal;", "invalidated", "", "getOwner", "()Landroidx/compose/ui/node/Owner;", "removed", "Landroidx/compose/ui/node/LayoutNode;", "removedLocal", "insertedProvider", "", "node", "key", "invalidate", "invalidateConsumersOfNodeForKey", "Landroidx/compose/ui/Modifier$Node;", "set", "", "removedProvider", "triggerUpdates", "updatedProvider", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModifierLocalManager {
    private final MutableVector<BackwardsCompatNode> inserted;
    private final MutableVector<ModifierLocal<?>> insertedLocal;
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<LayoutNode> removed;
    private final MutableVector<ModifierLocal<?>> removedLocal;

    public ModifierLocalManager(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
        this.inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);
        this.insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);
        this.removed = new MutableVector<>(new LayoutNode[16], 0);
        this.removedLocal = new MutableVector<>(new ModifierLocal[16], 0);
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[LOOP:2: B:19:0x0089->B:21:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void triggerUpdates() {
        int size;
        int i = 0;
        this.invalidated = false;
        HashSet<BackwardsCompatNode> hashSet = new HashSet();
        MutableVector<LayoutNode> mutableVector = this.removed;
        int size2 = mutableVector.getSize();
        if (size2 <= 0) {
            this.removed.clear();
            this.removedLocal.clear();
            MutableVector<BackwardsCompatNode> mutableVector2 = this.inserted;
            size = mutableVector2.getSize();
            if (size > 0) {
            }
        } else {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = content[i2];
                ModifierLocal<?> modifierLocal = this.removedLocal.getContent()[i2];
                if (layoutNode.getNodes$ui_release().getHead$ui_release().isAttached()) {
                    invalidateConsumersOfNodeForKey(layoutNode.getNodes$ui_release().getHead$ui_release(), modifierLocal, hashSet);
                }
                i2++;
            } while (i2 < size2);
            this.removed.clear();
            this.removedLocal.clear();
            MutableVector<BackwardsCompatNode> mutableVector22 = this.inserted;
            size = mutableVector22.getSize();
            if (size > 0) {
                this.inserted.clear();
                this.insertedLocal.clear();
                while (r0.hasNext()) {
                }
            }
            BackwardsCompatNode[] content2 = mutableVector22.getContent();
            do {
                BackwardsCompatNode backwardsCompatNode = content2[i];
                ModifierLocal<?> modifierLocal2 = this.insertedLocal.getContent()[i];
                if (backwardsCompatNode.isAttached()) {
                    invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i++;
            } while (i < size);
            this.inserted.clear();
            this.insertedLocal.clear();
            for (BackwardsCompatNode backwardsCompatNode2 : hashSet) {
                backwardsCompatNode2.updateModifierLocalConsumer();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        boolean z;
        Modifier.Node node2 = node;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(32);
        if (!node2.getNode().isAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = node2.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2.getNode());
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node3 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node3.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
                for (Modifier.Node node4 = node3; node4 != null; node4 = node4.getChild$ui_release()) {
                    if ((node4.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                        Modifier.Node node5 = node4;
                        MutableVector mutableVector2 = null;
                        while (true) {
                            if (node5 == null) {
                                z = true;
                                break;
                            }
                            if (node5 instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) node5;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (!(!modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal))) {
                                    z = false;
                                    break;
                                }
                            } else if (((node5.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node5 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node5).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node5 = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node5 != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node5);
                                                }
                                                node5 = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node5 = DelegatableNodeKt.pop(mutableVector2);
                        }
                        if (z) {
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node3);
        }
    }

    public final void updatedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }

    public final void insertedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.inserted.add(node);
        this.insertedLocal.add(key);
        invalidate();
    }

    public final void removedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.removed.add(DelegatableNodeKt.requireLayoutNode(node));
        this.removedLocal.add(key);
        invalidate();
    }
}

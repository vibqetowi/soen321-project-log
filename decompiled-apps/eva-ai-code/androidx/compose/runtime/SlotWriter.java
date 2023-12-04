package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b9\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\nJ\u000e\u00105\u001a\u0002022\u0006\u00104\u001a\u00020\nJ\u0010\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\r\u00109\u001a\u000202H\u0000¢\u0006\u0002\b:J\u0006\u0010;\u001a\u000202J\u0010\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u000202H\u0002J\u0006\u0010?\u001a\u000202J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0010\u0010A\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J \u0010B\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010D\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\nH\u0002J(\u0010F\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010H\u001a\u00020\nJ\u0006\u0010I\u001a\u000202J\u000e\u0010J\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u000e\u0010J\u001a\u0002022\u0006\u00107\u001a\u00020\nJ \u0010K\u001a\u0002022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0002J\u0010\u0010M\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u0010\u0010N\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u000e\u0010O\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010Q\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010SJ\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0016\u0010W\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010X\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0010\u0010Y\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u0010\u0010[\u001a\u0002022\u0006\u0010&\u001a\u00020\nH\u0002J\u000e\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u00020\nJ\u0018\u0010^\u001a\u0002022\u0006\u0010&\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020\n0`H\u0002J\u0010\u0010a\u001a\u0002022\b\b\u0002\u0010=\u001a\u00020\nJ \u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J&\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00070`2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\n2\b\b\u0002\u0010f\u001a\u00020\u000eJ\u000e\u0010g\u001a\u0002022\u0006\u0010h\u001a\u00020\nJ\u0010\u0010i\u001a\u0002022\u0006\u00107\u001a\u00020\nH\u0002J$\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070`2\u0006\u0010h\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\nJ\u0018\u0010k\u001a\u0002022\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J$\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00070`2\u0006\u00106\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\n2\u0006\u0010m\u001a\u00020\u0000J\u0010\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u0007J\u0010\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010o\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0018\u0010p\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0002J\b\u0010q\u001a\u000202H\u0002J\u0018\u0010r\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u0006\u0010s\u001a\u00020\u000eJ\u0018\u0010t\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\nH\u0002J \u0010w\u001a\u0002022\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u0006\u0010x\u001a\u000202J\b\u0010y\u001a\u00020\nH\u0002J\b\u0010z\u001a\u000202H\u0002J\u000e\u0010{\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u0010\u0010|\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u001a\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\b\u0010}\u001a\u0004\u0018\u00010\u0001J\u0006\u0010~\u001a\u00020\nJ\u0006\u0010\u007f\u001a\u000202J\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\nJ\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0081\u0001\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u001a\u0010\u0082\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001J%\u0010\u0082\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u0085\u0001\u001a\u000202J\u000f\u0010\u0085\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\nJ\u001a\u0010\u0085\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001J/\u0010\u0085\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0087\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001J$\u0010\u0087\u0001\u001a\u0002022\u0006\u0010]\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010n\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0088\u0001\u001a\u00020UH\u0016J\u0013\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u008a\u0001\u001a\u0002022\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u008d\u0001\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u008e\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\nH\u0002J\u0019\u0010\u008f\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\n2\u0006\u0010|\u001a\u00020%H\u0002J\u0019\u0010\u0090\u0001\u001a\u0002022\u0006\u00106\u001a\u00020\u00072\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u0090\u0001\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0091\u0001\u001a\u0002022\u0006\u00107\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010\u0092\u0001\u001a\u0002022\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\u000f\u0010\u0093\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0094\u0001J\u000f\u0010\u0095\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0096\u0001J\u0015\u0010\u0097\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010D\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0013\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\n0`*\u00020\u001cH\u0002J\u001b\u0010\u0099\u0001\u001a\u000202*\b0\u009a\u0001j\u0003`\u009b\u00012\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009c\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\n*\u00020\u001c2\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009d\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u001d\u0010\u009e\u0001\u001a\u000202*\u00020\u001c2\u0006\u00103\u001a\u00020\n2\u0006\u0010D\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\fR\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006 \u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "addToGroupSizeAlongSpine", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "amount", "advanceBy", "anchor", FirebaseAnalytics.Param.INDEX, "anchorIndex", "bashGroup", "bashGroup$runtime_release", "beginInsert", "childContainsAnyMarks", "group", "clearSlotGap", "close", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "value", "insertGroups", "insertParentGroup", "key", "insertSlots", UserMetadata.KEYDATA_FILENAME, "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "recalculateMarks", "removeAnchors", "removeGroup", "removeGroups", TtmlNode.START, "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "groupIndex", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SlotWriter {
    public static final Companion Companion = new Companion(null);
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private final IntStack nodeCountStack;
    private int parent;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private final IntStack startStack;
    private final SlotTable table;

    private final int dataAnchorToDataIndex(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public SlotWriter(SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        int i = this.currentGroup;
        if (i < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNode(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
        return isNode;
    }

    public final int nodeCount(int i) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i));
        return nodeCount;
    }

    public final int groupKey(int i) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i));
        return key;
    }

    public final Object groupObjectKey(int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
        return groupSize;
    }

    public final Object groupAux(int i) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        return hasAux ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        return (i > i2 && i < this.currentGroupEnd) || (i2 == 0 && i == 0);
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int i2) {
        int capacity;
        int groupSize;
        if (i2 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i2 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.startStack.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i2;
        }
        return i > i2 && i < capacity;
    }

    public final Object node(int i) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    public final int parent(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final void reset() {
        if (this.insertCount == 0) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object update(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void insertAux(Object obj) {
        boolean hasAux;
        if (this.insertCount >= 0) {
            int i = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i);
            hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
            if (!hasAux) {
                insertSlots(1, i);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i2 = this.currentSlot;
                if (i2 > auxIndex) {
                    int i3 = i2 - auxIndex;
                    if (!(i3 < 3)) {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                    if (i3 > 1) {
                        Object[] objArr = this.slots;
                        objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                    }
                    Object[] objArr2 = this.slots;
                    objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                }
                SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = obj;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void set(Object obj) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object set(int i, Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        boolean z = true;
        int i2 = slotIndex + i;
        if (!((i2 < slotIndex || i2 >= dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) ? false : false)) {
            ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i + " for group " + this.currentGroup).toString());
            throw new KotlinNothingValueException();
        }
        int dataIndexToDataAddress = dataIndexToDataAddress(i2);
        Object[] objArr = this.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = obj;
        return obj2;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final Object slot(Anchor anchor, int i) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return slot(anchorIndex(anchor), i);
    }

    public final Object slot(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        boolean z = true;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = i2 + slotIndex;
        if (slotIndex > i3 || i3 >= dataIndex) {
            z = false;
        }
        if (!z) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i3)];
    }

    public final void advanceBy(int i) {
        boolean z = true;
        if (i >= 0) {
            if (!(this.insertCount <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            }
            if (i == 0) {
                return;
            }
            int i2 = this.currentGroup + i;
            if (i2 < this.parent || i2 > this.currentGroupEnd) {
                z = false;
            }
            if (!z) {
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + Soundex.SILENT_MARKER + this.currentGroupEnd + ')').toString());
                throw new KotlinNothingValueException();
            }
            this.currentGroup = i2;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    public final void seek(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        int i = this.insertCount;
        if (!(i > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.insertCount = i2;
        if (i2 == 0) {
            if (this.nodeCountStack.getSize() == this.startStack.getSize()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            startGroup(0, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
        } else {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void startGroup(int i) {
        startGroup(i, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int i, Object obj) {
        startGroup(i, obj, false, Composer.Companion.getEmpty());
    }

    public final void startNode(int i, Object obj) {
        startGroup(i, obj, true, Composer.Companion.getEmpty());
    }

    public final void startNode(int i, Object obj, Object obj2) {
        startGroup(i, obj, true, obj2);
    }

    public final void startData(int i, Object obj, Object obj2) {
        startGroup(i, obj, false, obj2);
    }

    public final void startData(int i, Object obj) {
        startGroup(i, Composer.Companion.getEmpty(), false, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i, Object obj, boolean z, Object obj2) {
        int nodeCount;
        int groupSize;
        int i2;
        Object[] objArr = this.insertCount > 0 ? 1 : null;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != null) {
            insertGroups(1);
            int i3 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i3);
            int i4 = obj != Composer.Companion.getEmpty() ? 1 : 0;
            int i5 = (z || obj2 == Composer.Companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i, z, i4, i5, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i6 = (z ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                insertSlots(i6, i3);
                Object[] objArr2 = this.slots;
                int i7 = this.currentSlot;
                if (z) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = obj;
                    i7++;
                }
                if (i5 != 0) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            i2 = i3 + 1;
            this.parent = i3;
            this.currentGroup = i2;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i8 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i8);
            if (!Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i2 = i8 + groupSize;
        }
        this.currentGroupEnd = i2;
    }

    public final int endGroup() {
        boolean isNode;
        int groupSize;
        int nodeCount;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (isNode ? 1 : i4);
            this.parent = parent(this.groups, i3);
        } else {
            if ((i != i2 ? 0 : 1) != 0) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
                SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
                int pop = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop;
                int parent = parent(this.groups, i3);
                int pop2 = this.nodeCountStack.pop();
                this.nodeCount = pop2;
                if (parent == pop) {
                    this.nodeCount = pop2 + (isNode ? 0 : i4 - nodeCount);
                } else {
                    int i6 = i5 - groupSize;
                    int i7 = isNode ? 0 : i4 - nodeCount;
                    if (i6 != 0 || i7 != 0) {
                        while (parent != 0 && parent != pop && (i7 != 0 || i6 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent);
                            if (i6 != 0) {
                                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i6);
                            }
                            if (i7 != 0) {
                                int[] iArr = this.groups;
                                nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                                SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i7);
                            }
                            isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                            if (isNode2) {
                                i7 = 0;
                            }
                            parent = parent(this.groups, parent);
                        }
                    }
                    this.nodeCount += i7;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i4;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void ensureStarted(int i) {
        boolean z = true;
        if (this.insertCount <= 0) {
            int i2 = this.parent;
            if (i2 != i) {
                if (i < i2 || i >= this.currentGroupEnd) {
                    z = false;
                }
                if (!z) {
                    ComposerKt.composeRuntimeError(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                    throw new KotlinNothingValueException();
                }
                int i3 = this.currentGroup;
                int i4 = this.currentSlot;
                int i5 = this.currentSlotEnd;
                this.currentGroup = i;
                startGroup();
                this.currentGroup = i3;
                this.currentSlot = i4;
                this.currentSlotEnd = i5;
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void ensureStarted(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = i + groupSize;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return 1;
        }
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        return nodeCount;
    }

    public final boolean removeGroup() {
        if (this.insertCount == 0) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int skipGroup = skipGroup();
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    public final void moveGroup(int i) {
        int groupSize;
        int groupSize2;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (!(i >= 0)) {
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        } else if (i != 0) {
            int i2 = this.currentGroup;
            int i3 = this.parent;
            int i4 = this.currentGroupEnd;
            int i5 = i2;
            for (int i6 = i; i6 > 0; i6--) {
                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i5));
                i5 += groupSize2;
                if (!(i5 <= i4)) {
                    ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                    throw new KotlinNothingValueException();
                }
            }
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i5));
            int i7 = this.currentSlot;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i5));
            int i8 = i5 + groupSize;
            int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i8));
            int i9 = dataIndex2 - dataIndex;
            insertSlots(i9, Math.max(this.currentGroup - 1, 0));
            insertGroups(groupSize);
            int[] iArr = this.groups;
            int groupIndexToAddress = groupIndexToAddress(i8) * 5;
            ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i2) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
            if (i9 > 0) {
                Object[] objArr = this.slots;
                ArraysKt.copyInto(objArr, objArr, i7, dataIndexToDataAddress(dataIndex + i9), dataIndexToDataAddress(dataIndex2 + i9));
            }
            int i10 = dataIndex + i9;
            int i11 = i10 - i7;
            int i12 = this.slotsGapStart;
            int i13 = this.slotsGapLen;
            int length = this.slots.length;
            int i14 = this.slotsGapOwner;
            int i15 = i2 + groupSize;
            int i16 = i2;
            while (i16 < i15) {
                int groupIndexToAddress2 = groupIndexToAddress(i16);
                int i17 = i12;
                int i18 = i11;
                updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i11, i14 < groupIndexToAddress2 ? 0 : i17, i13, length));
                i16++;
                i12 = i17;
                i11 = i18;
            }
            moveAnchors(i8, i2, groupSize);
            if (!removeGroups(i8, groupSize)) {
                fixParentAnchorsFor(i3, this.currentGroupEnd, i2);
                if (i9 > 0) {
                    removeSlots(i10, i9, i8 - 1);
                    return;
                }
                return;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            int locationOf;
            int locationOf2;
            ArrayList emptyList;
            boolean isNode;
            int locationOf3;
            int i2;
            int parentAnchor;
            int groupSize = slotWriter.groupSize(i);
            int i3 = i + groupSize;
            int dataIndex = slotWriter.dataIndex(i);
            int dataIndex2 = slotWriter.dataIndex(i3);
            int i4 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i);
            slotWriter2.insertGroups(groupSize);
            slotWriter2.insertSlots(i4, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i3) {
                slotWriter.moveGroupGapTo(i3);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i3);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            ArraysKt.copyInto(slotWriter.groups, iArr, currentGroup * 5, i * 5, i3 * 5);
            Object[] objArr = slotWriter2.slots;
            int i5 = slotWriter2.currentSlot;
            ArraysKt.copyInto(slotWriter.slots, objArr, i5, dataIndex, dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i6 = currentGroup - i;
            int i7 = currentGroup + groupSize;
            int dataIndex3 = i5 - slotWriter2.dataIndex(iArr, currentGroup);
            int i8 = slotWriter2.slotsGapOwner;
            int i9 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i10 = i8;
            int i11 = currentGroup;
            while (true) {
                z4 = false;
                if (i11 >= i7) {
                    break;
                }
                if (i11 != currentGroup) {
                    parentAnchor = SlotTableKt.parentAnchor(iArr, i11);
                    i2 = i7;
                    SlotTableKt.updateParentAnchor(iArr, i11, parentAnchor + i6);
                } else {
                    i2 = i7;
                }
                int i12 = dataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i11, slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i11) + dataIndex3, i10 >= i11 ? slotWriter2.slotsGapStart : 0, i9, length));
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                dataIndex3 = i12;
                i7 = i2;
            }
            int i13 = i7;
            slotWriter2.slotsGapOwner = i10;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i, slotWriter.getSize$runtime_release());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i3, slotWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(locationOf2 - locationOf);
                for (int i14 = locationOf; i14 < locationOf2; i14++) {
                    Object obj = arrayList.get(i14);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i6);
                    arrayList2.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            int parent2 = slotWriter.parent(i);
            if (z3) {
                if (!z) {
                    z4 = slotWriter.removeGroups(i, groupSize);
                    slotWriter.removeSlots(dataIndex, i4, i - 1);
                } else {
                    Object[] objArr2 = parent2 >= 0 ? 1 : null;
                    if (objArr2 != null) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent2 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (objArr2 != null) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z4 = removeGroup;
                }
            }
            if (!z4) {
                int i15 = slotWriter2.nodeCount;
                isNode = SlotTableKt.isNode(iArr, currentGroup);
                slotWriter2.nodeCount = i15 + (isNode ? 1 : SlotTableKt.nodeCount(iArr, currentGroup));
                if (z2) {
                    slotWriter2.currentGroup = i13;
                    slotWriter2.currentSlot = i5 + i4;
                }
                if (containsAnyGroupMarks) {
                    slotWriter2.updateContainsMark(parent);
                }
                return emptyList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int i, SlotWriter writer) {
        int groupSize;
        boolean isNode;
        int nodeCount;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i;
        int i2 = this.currentGroup;
        ComposerKt.runtimeCheck(i2 <= anchorIndex && anchorIndex < this.currentGroupEnd);
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount2 = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount2 > 0;
        while (parent >= i2) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z) {
                isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
                if (isNode) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    nodeCount = SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount - nodeCount2);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            ComposerKt.runtimeCheck(this.nodeCount >= nodeCount2);
            this.nodeCount -= nodeCount2;
        }
        return moveGroup$default;
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    public final List<Anchor> moveFrom(SlotTable table, int i, boolean z) {
        int groupSize;
        Intrinsics.checkNotNullParameter(table, "table");
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(table.getGroups(), i);
            if (groupSize == table.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
                return this.anchors;
            }
        }
        SlotWriter openWriter = table.openWriter();
        try {
            return Companion.moveGroup(openWriter, i, this, true, true, z);
        } finally {
            openWriter.close();
        }
    }

    public final void insertParentGroup(int i) {
        int dataAnchor;
        int nodeCount;
        int groupSize;
        int i2 = 0;
        if (this.insertCount == 0) {
            if (isGroupEnd()) {
                beginInsert();
                startGroup(i);
                endGroup();
                endInsert();
                return;
            }
            int i3 = this.currentGroup;
            int parent = parent(this.groups, i3);
            int groupSize2 = parent + groupSize(parent);
            int i4 = groupSize2 - i3;
            int i5 = i3;
            while (i5 < groupSize2) {
                int groupIndexToAddress = groupIndexToAddress(i5);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                i2 += nodeCount;
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                i5 += groupSize;
            }
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i3));
            beginInsert();
            insertGroups(1);
            endInsert();
            int groupIndexToAddress2 = groupIndexToAddress(i3);
            SlotTableKt.initGroup(this.groups, groupIndexToAddress2, i, false, false, false, parent, dataAnchor);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, i4 + 1);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress2, i2);
            addToGroupSizeAlongSpine(groupIndexToAddress(parent), 1);
            fixParentAnchorsFor(parent, groupSize2, i3);
            this.currentGroup = groupSize2;
            return;
        }
        ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void addToGroupSizeAlongSpine(int i, int i2) {
        int groupSize;
        int parentAnchor;
        while (i > 0) {
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, i);
            SlotTableKt.updateGroupSize(iArr, i, groupSize + i2);
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i);
            i = groupIndexToAddress(parentAnchorToIndex(parentAnchor));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (groupSize(r12.currentGroup + r13) == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Anchor> moveIntoGroupFrom(int i, SlotTable table, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        boolean z = this.insertCount <= 0;
        ComposerKt.runtimeCheck(z);
        int i3 = this.currentGroup;
        int i4 = this.currentSlot;
        int i5 = this.currentSlotEnd;
        advanceBy(i);
        startGroup();
        beginInsert();
        SlotWriter openWriter = table.openWriter();
        try {
            List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, openWriter, i2, this, false, true, false, 32, null);
            openWriter.close();
            endInsert();
            endGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
            return moveGroup$default;
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    public final Anchor anchor(int i) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, getSize$runtime_release());
        if (search < 0) {
            if (i > this.groupGapStart) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int i) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasMark = SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (hasMark) {
            return;
        }
        SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark) {
            return;
        }
        updateContainsMark(parent(i));
    }

    private final boolean containsGroupMark(int i) {
        boolean containsMark;
        if (i >= 0) {
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress(i));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i) {
        boolean containsAnyMark;
        if (i >= 0) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i);
        }
    }

    private final void updateContainsMarkNow(int i, PrioritySet prioritySet) {
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i);
        boolean childContainsAnyMarks = childContainsAnyMarks(i);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int i) {
        boolean containsAnyMark;
        int i2 = i + 1;
        int groupSize = i + groupSize(i);
        while (i2 < groupSize) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i2));
            if (containsAnyMark) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + Soundex.SILENT_MARKER + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int i, int i2, int i3) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i, this.groupGapStart);
        while (i3 < i2) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i3), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i3));
            int i4 = groupSize + i3;
            fixParentAnchorsFor(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i) {
        int parentAnchor;
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != i) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    ArraysKt.copyInto(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i3 < capacity);
            while (i3 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i3);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i3, parentIndexToAnchor);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i, int i2) {
        int dataAnchor;
        int dataAnchor2;
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                ArraysKt.copyInto(objArr, objArr, i + i3, i, i4);
            } else {
                ArraysKt.copyInto(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, getSize$runtime_release());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i6 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i6) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i) {
        if (i > 0) {
            int i2 = this.currentGroup;
            moveGroupGapTo(i2);
            int i3 = this.groupGapStart;
            int i4 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i3 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.groups = iArr2;
                i4 = i6;
            }
            int i7 = this.currentGroupEnd;
            if (i7 >= i3) {
                this.currentGroupEnd = i7 + i;
            }
            int i8 = i3 + i;
            this.groupGapStart = i8;
            this.groupGapLen = i4 - i;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i5 > 0 ? dataIndex(i2 + i) : 0, this.slotsGapOwner >= i3 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i9 = i3; i9 < i8; i9++) {
                SlotTableKt.updateDataAnchor(this.groups, i9, dataIndexToDataAnchor);
            }
            int i10 = this.slotsGapOwner;
            if (i10 >= i3) {
                this.slotsGapOwner = i10 + i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                ArraysKt.copyInto(objArr, objArr2, 0, 0, i3);
                ArraysKt.copyInto(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.slots = objArr2;
                i4 = i7;
            }
            int i8 = this.currentSlotEnd;
            if (i8 >= i3) {
                this.currentSlotEnd = i8 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i, int i2) {
        if (i2 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            r0 = arrayList.isEmpty() ^ true ? removeAnchors(i, i2) : false;
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i3 = this.slotsGapOwner;
            if (i3 > i) {
                this.slotsGapOwner = Math.max(i, i3 - i2);
            }
            int i4 = this.currentGroupEnd;
            if (i4 >= this.groupGapStart) {
                this.currentGroupEnd = i4 - i2;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            ArraysKt.fill(this.slots, (Object) null, i, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNodeOfGroup(int i, Object obj) {
        boolean z;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if (groupIndexToAddress < iArr.length) {
            isNode = SlotTableKt.isNode(iArr, groupIndexToAddress);
            if (isNode) {
                z = true;
                if (z) {
                    ComposerKt.composeRuntimeError(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
                    throw new KotlinNothingValueException();
                }
                this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = obj;
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    private final void updateAnchors(int i, int i2) {
        int locationOf;
        int locationOf2;
        int i3;
        int capacity = getCapacity() - this.groupGapLen;
        if (i < i2) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, i, capacity); locationOf2 < this.anchors.size(); locationOf2++) {
                Anchor anchor = this.anchors.get(locationOf2);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation$runtime_release();
                if (location$runtime_release >= 0 || (i3 = location$runtime_release + capacity) >= i2) {
                    return;
                }
                anchor2.setLocation$runtime_release(i3);
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, i2, capacity); locationOf < this.anchors.size(); locationOf++) {
            Anchor anchor3 = this.anchors.get(locationOf);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation$runtime_release();
            if (location$runtime_release2 < 0) {
                return;
            }
            anchor4.setLocation$runtime_release(-(capacity - location$runtime_release2));
        }
    }

    private final boolean removeAnchors(int i, int i2) {
        int locationOf;
        int i3 = i2 + i;
        locationOf = SlotTableKt.locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i4 = locationOf + 1;
        int i5 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int anchorIndex = anchorIndex(anchor2);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = locationOf + 1;
                }
                i4 = locationOf;
            }
            locationOf--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.anchors.subList(i4, i5).clear();
        }
        return z;
    }

    private final void moveAnchors(int i, int i2, int i3) {
        int locationOf;
        int locationOf2;
        int i4 = i3 + i;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(locationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int anchorIndex = anchorIndex(anchor2);
                if (anchorIndex < i || anchorIndex >= i4) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(locationOf);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Anchor anchor3 = (Anchor) arrayList.get(i6);
            int anchorIndex2 = anchorIndex(anchor3) + i5;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor3);
        }
    }

    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (groupIndexToAddress != i) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                if (i2 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i2)]));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i) {
        return i < slotWriter.currentGroup && (i == slotWriter.parent || slotWriter.startStack.indexOf(i) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i)));
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (!(dataIndex >= i3)) {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + dataIndex).toString());
            }
            if (!(dataIndex <= length)) {
                throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i2).toString());
            }
            if (dataAnchor < 0 && !z) {
                if (!(i == i2)) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                }
                z = true;
            }
            i2++;
            i3 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        int parentAnchor2;
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                for (int i4 = i2 + i; i4 < capacity; i4++) {
                    parentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                    if (parentAnchorToIndex(parentAnchor) < i) {
                        if (!(parentAnchor > -2)) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                        }
                    } else {
                        if (!(parentAnchor <= -2)) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
                        }
                    }
                }
                return;
            }
            parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i3);
            if (!(parentAnchor2 > -2)) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
            }
            i3++;
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int groupIndexToAddress(int i) {
        return i < this.groupGapStart ? i : i + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i) {
        return i < this.slotsGapStart ? i : i + this.slotsGapLen;
    }

    private final int parent(int[] iArr, int i) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i));
        return parentAnchorToIndex(parentAnchor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        int dataAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    private final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i);
        groupInfo = SlotTableKt.groupInfo(iArr, i);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List plus = CollectionsKt.plus((Collection) CollectionsKt.slice(dataAnchors$default, RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(dataAnchors$default, RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(plus.size());
        int size = plus.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) plus.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        int i = 0;
        while (i < size) {
            Object obj = keys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i++;
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int i, int i2) {
        return i < i2 ? i : -((getSize$runtime_release() - i) + 2);
    }

    private final int parentAnchorToIndex(int i) {
        return i > -2 ? i : getSize$runtime_release() + i + 2;
    }
}

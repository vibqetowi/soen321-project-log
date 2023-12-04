package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b#\b \u0018\u0000 \u0092\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004\u0092\u0002\u0093\u0002B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 H\u0002J,\u0010\u0086\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J \u0010\u008e\u0001\u001a\u00020Q2\u0006\u0010P\u001a\u00020QH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J*\u0010\u0091\u0001\u001a\u00020\u001a2\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\u0006\u0010P\u001a\u00020QH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0010\u0010\u0095\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u00062\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0004J\u0012\u0010\u009a\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0007H&J\u0018\u0010\u009c\u0001\u001a\u00020\u00002\u0007\u0010\u009d\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u009e\u0001J\"\u0010\u009f\u0001\u001a\u00030\u008a\u00012\u0007\u0010b\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010\u0090\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 H\u0002J&\u0010£\u0001\u001a\u00020 2\f\u0010¤\u0001\u001a\u0007\u0012\u0002\b\u00030¥\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J&\u0010¨\u0001\u001a\u0004\u0018\u00010w2\f\u0010¤\u0001\u001a\u0007\u0012\u0002\b\u00030¥\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0014\u0010«\u0001\u001a\u0004\u0018\u00010w2\u0007\u0010¬\u0001\u001a\u00020 H\u0002JF\u0010\u00ad\u0001\u001a\u00020\u00072\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001JH\u0010¶\u0001\u001a\u00020\u00072\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b·\u0001\u0010µ\u0001J\t\u0010¸\u0001\u001a\u00020\u0007H\u0016J\u0013\u0010¹\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0096\u0002J\"\u0010º\u0001\u001a\u00020 2\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0007\u0010½\u0001\u001a\u00020 J\u001c\u0010¾\u0001\u001a\u00030¿\u00012\u0007\u0010À\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020 H\u0016J,\u0010Á\u0001\u001a\u00030\u008a\u00012\u0007\u0010À\u0001\u001a\u00020\u00032\b\u0010Â\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J#\u0010Å\u0001\u001a\u00030\u008a\u00012\b\u0010Æ\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÇ\u0001\u0010\u0090\u0001J#\u0010È\u0001\u001a\u00030\u008a\u00012\b\u0010Æ\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÉ\u0001\u0010\u0090\u0001J#\u0010Ê\u0001\u001a\u00030\u008a\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010\u0090\u0001J\u000f\u0010Ì\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\bÍ\u0001J\t\u0010Î\u0001\u001a\u00020\u0007H\u0016J\u0007\u0010Ï\u0001\u001a\u00020\u0007J\u001b\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020V2\u0007\u0010Ò\u0001\u001a\u00020VH\u0014J\u0007\u0010Ó\u0001\u001a\u00020\u0007J\u0007\u0010Ô\u0001\u001a\u00020\u0007J\u0007\u0010Õ\u0001\u001a\u00020\u0007J\u0012\u0010Ö\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0016J8\u0010×\u0001\u001a\u00030Ø\u00012\u0007\u0010Ù\u0001\u001a\u00020-2\u0010\b\u0004\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Ø\u00010$H\u0084\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001JD\u0010Ý\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÞ\u0001\u0010ß\u0001JD\u0010à\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bá\u0001\u0010ß\u0001JB\u0010â\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bã\u0001\u0010ß\u0001J\u001d\u0010ä\u0001\u001a\u00020\u00072\b\u0010\u0088\u0001\u001a\u00030¿\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010å\u0001J,\u0010æ\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 2\t\b\u0002\u0010ç\u0001\u001a\u00020 H\u0000¢\u0006\u0003\bè\u0001J\u000f\u0010é\u0001\u001a\u00020\u0007H\u0010¢\u0006\u0003\bê\u0001J\u0007\u0010ë\u0001\u001a\u00020 J\"\u0010ì\u0001\u001a\u00030\u008a\u00012\u0007\u0010b\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bí\u0001\u0010\u0090\u0001J\b\u0010î\u0001\u001a\u00030¿\u0001J+\u0010ï\u0001\u001a\u00020\u00072\u0007\u0010À\u0001\u001a\u00020\u00032\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bò\u0001\u0010ó\u0001J+\u0010ô\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010ö\u0001J+\u0010÷\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ö\u0001J-\u0010ù\u0001\u001a\u00020\u00072\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\t\b\u0002\u0010ú\u0001\u001a\u00020 J\u0014\u0010û\u0001\u001a\u00020\u00072\t\b\u0002\u0010ü\u0001\u001a\u00020 H\u0002JL\u0010ý\u0001\u001a\u00020\u0007\"\u0007\b\u0000\u0010þ\u0001\u0018\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u0003Hþ\u00010¥\u00012\u0014\u0010Ú\u0001\u001a\u000f\u0012\u0005\u0012\u0003Hþ\u0001\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J4\u0010ý\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0002\u001a\u00020V2\u0007\u0010¬\u0001\u001a\u00020 2\u0013\u0010Ú\u0001\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003J#\u0010\u0082\u0002\u001a\u00030\u008a\u00012\b\u0010\u0083\u0002\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0090\u0001J+\u0010\u0085\u0002\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u00062\u0013\u0010Ú\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0003J\"\u0010\u0086\u0002\u001a\u00020 2\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0002\u0010¼\u0001JN\u0010\u0088\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002JW\u0010\u008b\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002JW\u0010\u008f\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u008e\u0002J\r\u0010\u0091\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u000e\u0010(\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001d\u0010,\u001a\u00020-8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103RD\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\u0019\u0010)\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR&\u0010E\u001a\u0004\u0018\u00010D2\b\u0010)\u001a\u0004\u0018\u00010D@dX¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010/R\u001c\u0010S\u001a\u0010\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010W\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0015R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0018R\u0016\u0010[\u001a\u0004\u0018\u00010\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010_\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b`\u0010\u0018R/\u0010b\u001a\u00020a2\u0006\u0010)\u001a\u00020a@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bc\u0010/\"\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020U0h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u000e\u0010n\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010o\u001a\u00020p8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bq\u0010/R\u0014\u0010r\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0012\u0010v\u001a\u00020wX¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u001c\u0010z\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R(\u0010\u0082\u0001\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u001c\"\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0094\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isValidOwnerScope", "lastLayerAlpha", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui_release", "()J", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "value", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parent", "getParent", "parentCoordinates", "getParentCoordinates", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "released", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "zIndex", "getZIndex", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "ensureLookaheadDelegateCreated", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "fromParentPosition", "fromParentPosition-MK-Hz9U", "fromParentRect", "bounds", "hasNode", "type", "Landroidx/compose/ui/node/NodeKind;", "hasNode-H91voCI", "(I)Z", TtmlNode.TAG_HEAD, "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "headNode", "includeTail", "hitTest", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "hitTestChild-YqVAtuI", "invalidateLayer", "invoke", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onCoordinatesUsed", "onCoordinatesUsed$ui_release", "onLayoutModifierNodeChanged", "onLayoutNodeAttach", "onMeasureResultChanged", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "onMeasured", "onPlaced", "onRelease", "performDraw", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeSelf", "placeSelf-f8xVGno", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset-f8xVGno", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "replace", "replace$ui_release", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-MK-Hz9U", "touchBoundsInRoot", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformToAncestor-EL8BTi8", "updateLayerBlock", "forceUpdateLayerParameters", "updateLayerParameters", "invokeOnLayoutChange", "visitNodes", ExifInterface.GPS_DIRECTION_TRUE, "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "mask", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "hit", "hit-1hIXUjU", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitNear", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "speculativeHit", "speculativeHit-JHbHoSQ", "toCoordinator", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m3522constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
        public void mo4752childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m4687hitTestM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw  reason: not valid java name */
        public int mo4753entityTypeOLwlOKw() {
            return NodeKind.m4757constructorimpl(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                    int i = 0;
                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != null) {
                                    if (mutableVector != null) {
                                        mutableVector.add(node);
                                    }
                                    node = null;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsConfiguration collapsedSemantics$ui_release = parentLayoutNode.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo4752childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m4688hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo4753entityTypeOLwlOKw() {
            return NodeKind.m4757constructorimpl(8);
        }
    };

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo4752childHitTestYqVAtuI(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2);

        /* renamed from: entityType-OLwlOKw */
        int mo4753entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract LookaheadDelegate getLookaheadDelegate();

    public abstract Modifier.Node getTail();

    public Object propagateRelocationRequest(Rect rect, Continuation<? super Unit> continuation) {
        return propagateRelocationRequest$suspendImpl(this, rect, continuation);
    }

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.Companion.m5735getZeronOccac();
        this.invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);
    }

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    public final void visitNodes(int i, boolean z, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node tail = getTail();
        if (!z && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(z); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i) != 0) {
                block.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ  reason: not valid java name */
    public final /* synthetic */ <T> void m4750visitNodesaLcG6gQ(int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean m4766getIncludeSelfInTraversalH91voCI = NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m4766getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m4766getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i) != 0) {
                Modifier.Node node = headNode;
                MutableVector mutableVector = null;
                while (node != null) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    if (node instanceof Object) {
                        block.invoke(node);
                    } else if (((node.getKindSet$ui_release() & i) != 0) && (node instanceof DelegatingNode)) {
                        int i2 = 0;
                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                            if ((delegate$ui_release.getKindSet$ui_release() & i) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    node = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = null;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: hasNode-H91voCI  reason: not valid java name */
    private final boolean m4730hasNodeH91voCI(int i) {
        Modifier.Node headNode = headNode(NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(i));
        return headNode != null && DelegatableNodeKt.m4657has64DMado(headNode, i);
    }

    /* renamed from: head-H91voCI  reason: not valid java name */
    public final Modifier.Node m4743headH91voCI(int i) {
        boolean m4766getIncludeSelfInTraversalH91voCI = NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!m4766getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m4766getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & i) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo4552getSizeYbymL2g() {
        return m4600getMeasuredSizeYbymL2g();
    }

    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer == null || this.lastLayerAlpha > 0.0f) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.isTransparent();
            }
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4546placeAtf8xVGno(mo4706getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.released && getLayoutNode().isAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    public void setMeasureResult$ui_release(MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!value.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                LinkedHashMap linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(value.getAlignmentLines());
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            boolean z = false;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                z = true;
            }
            if (z) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    protected void onMeasureResultChanged(int i, int i2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4806resizeozmzZPI(IntSizeKt.IntSize(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m4602setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        updateLayerParameters(false);
        int m4757constructorimpl = NodeKind.m4757constructorimpl(4);
        boolean m4766getIncludeSelfInTraversalH91voCI = NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(m4757constructorimpl);
        Modifier.Node tail = getTail();
        if (m4766getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4766getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                    Modifier.Node node = headNode;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof DrawModifierNode) {
                            ((DrawModifierNode) node).onMeasureResultChanged();
                        } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node);
                                            }
                                            node = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo4706getPositionnOccac() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs  reason: not valid java name */
    protected void m4748setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (getLayoutNode().getNodes$ui_release().m4720hasH91voCI$ui_release(NodeKind.m4757constructorimpl(64))) {
            getTail();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((NodeKind.m4757constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                    int m4757constructorimpl = NodeKind.m4757constructorimpl(64);
                    MutableVector mutableVector = null;
                    Modifier.Node node = tail$ui_release;
                    while (node != null) {
                        if (node instanceof ParentDataModifierNode) {
                            objectRef.element = ((ParentDataModifierNode) node).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                        } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node);
                                            }
                                            node = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
            return objectRef.element;
        }
        return null;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release  reason: not valid java name */
    public final long m4741getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m4601getMeasurementConstraintsmsEJaDk();
    }

    /* renamed from: performingMeasure-K40F9xA  reason: not valid java name */
    protected final Placeable m4746performingMeasureK40F9xA(long j, Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m4603setMeasurementConstraintsBRTryo0(j);
        return block.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4546placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        m4734placeSelff8xVGno(j, f, function1);
    }

    /* renamed from: placeSelf-f8xVGno  reason: not valid java name */
    private final void m4734placeSelff8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        updateLayerBlock$default(this, function1, false, 2, null);
        if (!IntOffset.m5724equalsimpl0(mo4706getPositionnOccac(), j)) {
            m4748setPositiongyyYBs(j);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4805movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f;
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno  reason: not valid java name */
    public final void m4747placeSelfApparentToRealOffsetf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        long j2 = m4599getApparentToRealOffsetnOccac();
        m4734placeSelff8xVGno(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(j) + IntOffset.m5725getXimpl(j2), IntOffset.m5726getYimpl(j) + IntOffset.m5726getYimpl(j2)), f, function1);
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m5725getXimpl = IntOffset.m5725getXimpl(mo4706getPositionnOccac());
        float m5726getYimpl = IntOffset.m5726getYimpl(mo4706getPositionnOccac());
        canvas.translate(m5725getXimpl, m5726getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m5725getXimpl, -m5726getYimpl);
    }

    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public void invoke2(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getLayoutNode().isPlaced()) {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new NodeCoordinator$invoke$1(this, canvas));
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.lastLayerDrawingWasSkipped = true;
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> function1, boolean z) {
        Owner owner$ui_release;
        LayoutNode layoutNode = getLayoutNode();
        boolean z2 = (!z && this.layerBlock == function1 && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = function1;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (isAttached() && function1 != null) {
            if (this.layer != null) {
                if (z2) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer createLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this, this.invalidateParentLayer);
            createLayer.mo4806resizeozmzZPI(m4600getMeasuredSizeYbymL2g());
            createLayer.mo4805movegyyYBs(mo4706getPositionnOccac());
            this.layer = createLayer;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                owner$ui_release.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    private final void updateLayerParameters(boolean z) {
        Owner owner$ui_release;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
            reusableGraphicsLayerScope.m3603setSizeuvyYCjk(IntSizeKt.m5777toSizeozmzZPI(mo4552getSizeYbymL2g()));
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new NodeCoordinator$updateLayerParameters$1(function1));
            LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                layerPositionalProperties = new LayerPositionalProperties();
                this.layerPositionalProperties = layerPositionalProperties;
            }
            layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
            ownedLayer.mo4808updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.mo3456getTransformOriginSzJe1aQ(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.mo3452getAmbientShadowColor0d7_KjU(), reusableGraphicsLayerScope.mo3455getSpotShadowColor0d7_KjU(), reusableGraphicsLayerScope.mo3453getCompositingStrategyNrFUSI(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
            this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
            if (!z || (owner$ui_release = getLayoutNode().getOwner$ui_release()) == null) {
                return;
            }
            owner$ui_release.onLayoutChange(getLayoutNode());
            return;
        }
        if (!(this.layerBlock == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc  reason: not valid java name */
    public final long m4742getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo589toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo4691getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* renamed from: hitTest-YqVAtuI  reason: not valid java name */
    public final void m4744hitTestYqVAtuI(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        Modifier.Node m4743headH91voCI = m4743headH91voCI(hitTestSource.mo4753entityTypeOLwlOKw());
        boolean z3 = true;
        if (!m4751withinLayerBoundsk4lQ0M(j)) {
            if (z) {
                float m4739distanceInMinimumTouchTargettz77jQw = m4739distanceInMinimumTouchTargettz77jQw(j, m4742getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(m4739distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m4739distanceInMinimumTouchTargettz77jQw)) {
                    z3 = false;
                }
                if (z3 && hitTestResult.isHitInMinimumTouchTargetBetter(m4739distanceInMinimumTouchTargettz77jQw, false)) {
                    m4732hitNearJHbHoSQ(m4743headH91voCI, hitTestSource, j, hitTestResult, z, false, m4739distanceInMinimumTouchTargettz77jQw);
                }
            }
        } else if (m4743headH91voCI == null) {
            mo4680hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (m4745isPointerInBoundsk4lQ0M(j)) {
            m4731hit1hIXUjU(m4743headH91voCI, hitTestSource, j, hitTestResult, z, z2);
        } else {
            float m4739distanceInMinimumTouchTargettz77jQw2 = !z ? Float.POSITIVE_INFINITY : m4739distanceInMinimumTouchTargettz77jQw(j, m4742getMinimumTouchTargetSizeNHjbRc());
            if (Float.isInfinite(m4739distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(m4739distanceInMinimumTouchTargettz77jQw2)) {
                z3 = false;
            }
            if (z3 && hitTestResult.isHitInMinimumTouchTargetBetter(m4739distanceInMinimumTouchTargettz77jQw2, z2)) {
                m4732hitNearJHbHoSQ(m4743headH91voCI, hitTestSource, j, hitTestResult, z, z2, m4739distanceInMinimumTouchTargettz77jQw2);
            } else {
                m4735speculativeHitJHbHoSQ(m4743headH91voCI, hitTestSource, j, hitTestResult, z, z2, m4739distanceInMinimumTouchTargettz77jQw2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU  reason: not valid java name */
    public final void m4731hit1hIXUjU(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        if (node == null) {
            mo4680hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(node, z2, new NodeCoordinator$hit$1(this, node, hitTestSource, j, hitTestResult, z, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ  reason: not valid java name */
    public final void m4732hitNearJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2, float f) {
        if (node == null) {
            mo4680hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f, z2, new NodeCoordinator$hitNear$1(this, node, hitTestSource, j, hitTestResult, z, z2, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: speculativeHit-JHbHoSQ  reason: not valid java name */
    public final void m4735speculativeHitJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2, float f) {
        if (node == null) {
            mo4680hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z2, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j, hitTestResult, z, z2, f));
        } else {
            m4735speculativeHitJHbHoSQ(NodeCoordinatorKt.m4754access$nextUntilhw7D004(node, hitTestSource.mo4753entityTypeOLwlOKw(), NodeKind.m4757constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo4680hitTestChildYqVAtuI(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m4744hitTestYqVAtuI(hitTestSource, nodeCoordinator.m4740fromParentPositionMKHz9U(j), hitTestResult, z, z2);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m4738calculateMinimumTouchTargetPaddingE7KxVPU = m4738calculateMinimumTouchTargetPaddingE7KxVPU(m4742getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m3087getWidthimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m3084getHeightimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m3087getWidthimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m3084getHeightimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo4557windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo4553localPositionOfR5De75A(findRootCoordinates, Offset.m3022minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo4809calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo4555localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo4810calculatePositionInWindowMKHz9U(mo4554localToRootMKHz9U(j));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl == null || (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) == null) {
            Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (NodeCoordinator) layoutCoordinates;
        }
        return coordinator;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo4553localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            return Offset.m3027unaryMinusF1C5BW0(sourceCoordinates.mo4553localPositionOfR5De75A(this, Offset.m3027unaryMinusF1C5BW0(j)));
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j = coordinator.m4749toParentPositionMKHz9U(j);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m4729ancestorToLocalR5De75A(findCommonAncestor$ui_release, j);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo4556transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m3531resetimpl(matrix);
        coordinator.m4737transformToAncestorEL8BTi8(findCommonAncestor$ui_release, matrix);
        m4736transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, matrix);
    }

    /* renamed from: transformToAncestor-EL8BTi8  reason: not valid java name */
    private final void m4737transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4807transform58bKbWc(fArr);
            }
            long mo4706getPositionnOccac = nodeCoordinator2.mo4706getPositionnOccac();
            if (!IntOffset.m5724equalsimpl0(mo4706getPositionnOccac, IntOffset.Companion.m5735getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m3531resetimpl(fArr2);
                Matrix.m3542translateimpl$default(fArr2, IntOffset.m5725getXimpl(mo4706getPositionnOccac), IntOffset.m5726getYimpl(mo4706getPositionnOccac), 0.0f, 4, null);
                Matrix.m3539timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator2);
        }
    }

    /* renamed from: transformFromAncestor-EL8BTi8  reason: not valid java name */
    private final void m4736transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (Intrinsics.areEqual(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator2);
        nodeCoordinator2.m4736transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m5724equalsimpl0(mo4706getPositionnOccac(), IntOffset.Companion.m5735getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m3531resetimpl(fArr2);
            Matrix.m3542translateimpl$default(fArr2, -IntOffset.m5725getXimpl(mo4706getPositionnOccac()), -IntOffset.m5726getYimpl(mo4706getPositionnOccac()), 0.0f, 4, null);
            Matrix.m3539timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4802inverseTransform58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m5767getWidthimpl(sourceCoordinates.mo4552getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m5766getHeightimpl(sourceCoordinates.mo4552getSizeYbymL2g()));
        while (coordinator != findCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, z, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(findCommonAncestor$ui_release, rectCache, z);
        return MutableRectKt.toRect(rectCache);
    }

    /* renamed from: ancestorToLocal-R5De75A  reason: not valid java name */
    private final long m4729ancestorToLocalR5De75A(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) {
            return m4740fromParentPositionMKHz9U(j);
        }
        return m4740fromParentPositionMKHz9U(nodeCoordinator2.m4729ancestorToLocalR5De75A(nodeCoordinator, j));
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo4554localToRootMKHz9U(long j) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            j = nodeCoordinator.m4749toParentPositionMKHz9U(j);
        }
        return j;
    }

    protected final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float m5725getXimpl = IntOffset.m5725getXimpl(mo4706getPositionnOccac());
        float m5726getYimpl = IntOffset.m5726getYimpl(mo4706getPositionnOccac());
        canvas.translate(m5725getXimpl, m5726getYimpl);
        block.invoke(canvas);
        canvas.translate(-m5725getXimpl, -m5726getYimpl);
    }

    /* renamed from: toParentPosition-MK-Hz9U  reason: not valid java name */
    public long m4749toParentPositionMKHz9U(long j) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j = ownedLayer.mo4804mapOffset8S9VItk(j, false);
        }
        return IntOffsetKt.m5739plusNvtHpc(j, mo4706getPositionnOccac());
    }

    /* renamed from: fromParentPosition-MK-Hz9U  reason: not valid java name */
    public long m4740fromParentPositionMKHz9U(long j) {
        long m5737minusNvtHpc = IntOffsetKt.m5737minusNvtHpc(j, mo4706getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo4804mapOffset8S9VItk(m5737minusNvtHpc, true) : m5737minusNvtHpc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void drawBorder(Canvas canvas, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m5767getWidthimpl(m4600getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m5766getHeightimpl(m4600getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void rectInParent$ui_release(MutableRect bounds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long m4742getMinimumTouchTargetSizeNHjbRc = m4742getMinimumTouchTargetSizeNHjbRc();
                    float m3087getWidthimpl = Size.m3087getWidthimpl(m4742getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m3084getHeightimpl = Size.m3084getHeightimpl(m4742getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-m3087getWidthimpl, -m3084getHeightimpl, IntSize.m5767getWidthimpl(mo4552getSizeYbymL2g()) + m3087getWidthimpl, IntSize.m5766getHeightimpl(mo4552getSizeYbymL2g()) + m3084getHeightimpl);
                } else if (z) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m5767getWidthimpl(mo4552getSizeYbymL2g()), IntSize.m5766getHeightimpl(mo4552getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m5725getXimpl = IntOffset.m5725getXimpl(mo4706getPositionnOccac());
        bounds.setLeft(bounds.getLeft() + m5725getXimpl);
        bounds.setRight(bounds.getRight() + m5725getXimpl);
        float m5726getYimpl = IntOffset.m5726getYimpl(mo4706getPositionnOccac());
        bounds.setTop(bounds.getTop() + m5726getYimpl);
        bounds.setBottom(bounds.getBottom() + m5726getYimpl);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float m5725getXimpl = IntOffset.m5725getXimpl(mo4706getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m5725getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m5725getXimpl);
        float m5726getYimpl = IntOffset.m5726getYimpl(mo4706getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m5726getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m5726getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m5767getWidthimpl(mo4552getSizeYbymL2g()), IntSize.m5766getHeightimpl(mo4552getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: withinLayerBounds-k-4lQ0M  reason: not valid java name */
    public final boolean m4751withinLayerBoundsk4lQ0M(long j) {
        if (OffsetKt.m3035isFinitek4lQ0M(j)) {
            OwnedLayer ownedLayer = this.layer;
            return ownedLayer == null || !this.isClipping || ownedLayer.mo4803isInLayerk4lQ0M(j);
        }
        return false;
    }

    /* renamed from: isPointerInBounds-k-4lQ0M  reason: not valid java name */
    protected final boolean m4745isPointerInBoundsk4lQ0M(long j) {
        float m3018getXimpl = Offset.m3018getXimpl(j);
        float m3019getYimpl = Offset.m3019getYimpl(j);
        return m3018getXimpl >= 0.0f && m3019getYimpl >= 0.0f && m3018getXimpl < ((float) getMeasuredWidth()) && m3019getYimpl < ((float) getMeasuredHeight());
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    static /* synthetic */ Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, Continuation<? super Unit> continuation) {
        Object propagateRelocationRequest;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        return (nodeCoordinator2 != null && (propagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m3055translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m3053getTopLeftF1C5BW0()), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? propagateRelocationRequest : Unit.INSTANCE;
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int m4757constructorimpl = NodeKind.m4757constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0 && parent$ui_release == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* renamed from: offsetFromEdge-MK-Hz9U  reason: not valid java name */
    private final long m4733offsetFromEdgeMKHz9U(long j) {
        float m3018getXimpl = Offset.m3018getXimpl(j);
        float max = Math.max(0.0f, m3018getXimpl < 0.0f ? -m3018getXimpl : m3018getXimpl - getMeasuredWidth());
        float m3019getYimpl = Offset.m3019getYimpl(j);
        return OffsetKt.Offset(max, Math.max(0.0f, m3019getYimpl < 0.0f ? -m3019getYimpl : m3019getYimpl - getMeasuredHeight()));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU  reason: not valid java name */
    protected final long m4738calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        return SizeKt.Size(Math.max(0.0f, (Size.m3087getWidthimpl(j) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m3084getHeightimpl(j) - getMeasuredHeight()) / 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: distanceInMinimumTouchTarget-tz77jQw  reason: not valid java name */
    public final float m4739distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() < Size.m3087getWidthimpl(j2) || getMeasuredHeight() < Size.m3084getHeightimpl(j2)) {
            long m4738calculateMinimumTouchTargetPaddingE7KxVPU = m4738calculateMinimumTouchTargetPaddingE7KxVPU(j2);
            float m3087getWidthimpl = Size.m3087getWidthimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU);
            float m3084getHeightimpl = Size.m3084getHeightimpl(m4738calculateMinimumTouchTargetPaddingE7KxVPU);
            long m4733offsetFromEdgeMKHz9U = m4733offsetFromEdgeMKHz9U(j);
            if ((m3087getWidthimpl > 0.0f || m3084getHeightimpl > 0.0f) && Offset.m3018getXimpl(m4733offsetFromEdgeMKHz9U) <= m3087getWidthimpl && Offset.m3019getYimpl(m4733offsetFromEdgeMKHz9U) <= m3084getHeightimpl) {
                return Offset.m3017getDistanceSquaredimpl(m4733offsetFromEdgeMKHz9U);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m4730hasNodeH91voCI(NodeKind.m4757constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int m4757constructorimpl = NodeKind.m4757constructorimpl(128);
                boolean m4766getIncludeSelfInTraversalH91voCI = NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(m4757constructorimpl);
                if (m4766getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail();
                } else {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                        Unit unit = Unit.INSTANCE;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                for (Modifier.Node headNode = headNode(m4766getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                    if ((headNode.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                        Modifier.Node node = headNode;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) node).mo476onRemeasuredozmzZPI(m4600getMeasuredSizeYbymL2g());
                            } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (headNode == parent$ui_release) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        Modifier.Node m4743headH91voCI = m4743headH91voCI(NodeKind.m4757constructorimpl(4));
        if (m4743headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m4692drawx_KDEd0$ui_release(canvas, IntSizeKt.m5777toSizeozmzZPI(mo4552getSizeYbymL2g()), this, m4743headH91voCI);
        }
    }

    public final void onPlaced() {
        int m4757constructorimpl = NodeKind.m4757constructorimpl(128);
        boolean m4766getIncludeSelfInTraversalH91voCI = NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(m4757constructorimpl);
        Modifier.Node tail = getTail();
        if (!m4766getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m4766getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
            if ((headNode.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                Modifier.Node node = headNode;
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) node).onPlaced(this);
                    } else if (((node.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                        int i = 0;
                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    node = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = null;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m4766getIncludeSelfInTraversalH91voCI(NodeKind.m4757constructorimpl(16)));
        if (headNode == null) {
            return false;
        }
        Modifier.Node node = headNode;
        int m4757constructorimpl = NodeKind.m4757constructorimpl(16);
        if (!node.getNode().isAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node node2 = node.getNode();
        if ((node2.getAggregateChildKindSet$ui_release() & m4757constructorimpl) != 0) {
            for (Modifier.Node child$ui_release = node2.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                    Modifier.Node node3 = child$ui_release;
                    MutableVector mutableVector = null;
                    while (node3 != null) {
                        if (node3 instanceof PointerInputModifierNode) {
                            if (((PointerInputModifierNode) node3).sharePointerInputWithSiblings()) {
                                return true;
                            }
                        } else if (((node3.getKindSet$ui_release() & m4757constructorimpl) != 0) && (node3 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4757constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node3 = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node3 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node3);
                                            }
                                            node3 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node3 = DelegatableNodeKt.pop(mutableVector);
                    }
                    continue;
                }
            }
        }
        return false;
    }
}

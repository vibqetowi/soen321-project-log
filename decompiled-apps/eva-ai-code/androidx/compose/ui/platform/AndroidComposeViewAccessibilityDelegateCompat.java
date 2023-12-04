package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u008b\u00022\u00020\u0001:\u000e\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010|\u001a\u00020\u001e2\u0006\u0010}\u001a\u00020\f2\u0006\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u00062\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0084\u0001J\u001d\u0010\u0085\u0001\u001a\u00020\u001e2\u0007\u0010\u0086\u0001\u001a\u00020\f2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020\u001e2\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0002J4\u0010\u0089\u0001\u001a\u00020\u000e2\u0007\u0010\u008a\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020\f2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001JC\u0010\u0089\u0001\u001a\u00020\u000e2\r\u00102\u001a\t\u0012\u0004\u0012\u0002040\u0090\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020\f2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\t\u0010\u0093\u0001\u001a\u00020\u001eH\u0002J\u0011\u0010\u0094\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\fH\u0002J!\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0006\u0010}\u001a\u00020\f2\u0007\u0010\u0097\u0001\u001a\u00020\fH\u0001¢\u0006\u0003\b\u0098\u0001J\u0013\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010}\u001a\u00020\fH\u0002JD\u0010\u009a\u0001\u001a\u00030\u0096\u00012\u0006\u0010}\u001a\u00020\f2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0003\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020\u000e2\b\u0010¡\u0001\u001a\u00030¢\u0001J\u0013\u0010£\u0001\u001a\u00020^2\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J\u0013\u0010¦\u0001\u001a\u00020\f2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0013\u0010©\u0001\u001a\u00020\f2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0013\u0010ª\u0001\u001a\u00020\u000e2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0015\u0010«\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0016\u0010¬\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0017\u0010®\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0002J!\u0010¯\u0001\u001a\u0005\u0018\u00010°\u00012\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\u0007\u0010±\u0001\u001a\u00020\fH\u0002J#\u0010²\u0001\u001a\u00020\f2\b\u0010³\u0001\u001a\u00030´\u00012\b\u0010µ\u0001\u001a\u00030´\u0001H\u0001¢\u0006\u0003\b¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\fH\u0002J\u0013\u0010¸\u0001\u001a\u00020\u000e2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0013\u0010¹\u0001\u001a\u00020\u000e2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\t\u0010º\u0001\u001a\u00020\u001eH\u0002J\u0012\u0010»\u0001\u001a\u00020\u001e2\u0007\u0010¼\u0001\u001a\u00020rH\u0002J\u0013\u0010½\u0001\u001a\u00020\u001e2\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002J\u0018\u0010¾\u0001\u001a\u00020\u001e2\u0007\u0010¼\u0001\u001a\u00020rH\u0000¢\u0006\u0003\b¿\u0001J\u000f\u0010À\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0003\bÁ\u0001J&\u0010Â\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\f2\u0007\u0010Ã\u0001\u001a\u00020\f2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J$\u0010Ä\u0001\u001a\u00020\u001e2\u0006\u0010}\u001a\u00020\f2\u0007\u0010~\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030¨\u0001H\u0007J!\u0010Ç\u0001\u001a\u00020\u000e2\u0007\u0010È\u0001\u001a\u00020\f2\r\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020l0>H\u0002J\u0011\u0010Ê\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\fH\u0002J&\u0010Ë\u0001\u001a\u0016\u0012\u0005\u0012\u00030¨\u00010Ì\u0001j\n\u0012\u0005\u0012\u00030¨\u0001`Í\u00012\u0007\u0010Î\u0001\u001a\u00020\u000eH\u0002J\u0012\u0010Ï\u0001\u001a\u00020\f2\u0007\u0010È\u0001\u001a\u00020\fH\u0002J\u001c\u0010Ð\u0001\u001a\u00020\u001e2\b\u0010Ñ\u0001\u001a\u00030¨\u00012\u0007\u0010Ò\u0001\u001a\u00020dH\u0002J\"\u0010Ó\u0001\u001a\u00020\u001e2\b\u0010Ñ\u0001\u001a\u00030¨\u00012\u0007\u0010Ò\u0001\u001a\u00020dH\u0001¢\u0006\u0003\bÔ\u0001J\u001b\u0010Õ\u0001\u001a\u00020\u001e2\u0007\u0010È\u0001\u001a\u00020\f2\u0007\u0010Ö\u0001\u001a\u00020\u0006H\u0002J\u0013\u0010×\u0001\u001a\u00020\u000e2\b\u0010¡\u0001\u001a\u00030\u0096\u0001H\u0002J@\u0010Ø\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\f2\u0007\u0010\u0097\u0001\u001a\u00020\f2\u000b\b\u0002\u0010Ù\u0001\u001a\u0004\u0018\u00010\f2\u0011\b\u0002\u0010Ú\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010>H\u0002¢\u0006\u0003\u0010Û\u0001J&\u0010Ü\u0001\u001a\u00020\u001e2\u0007\u0010Ý\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\f2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010ß\u0001\u001a\u00020\u001e2\u0007\u0010Ý\u0001\u001a\u00020\fH\u0002J\u0012\u0010à\u0001\u001a\u00020\u001e2\u0007\u0010á\u0001\u001a\u00020lH\u0002J$\u0010â\u0001\u001a\u00020\u001e2\u0013\u0010ã\u0001\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020403H\u0001¢\u0006\u0003\bä\u0001J!\u0010å\u0001\u001a\u00020\u001e2\u0007\u0010¼\u0001\u001a\u00020r2\r\u0010æ\u0001\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002J.\u0010ç\u0001\u001a\u00020\u000e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010è\u0001\u001a\u00020\f2\u0007\u0010é\u0001\u001a\u00020\f2\u0007\u0010ê\u0001\u001a\u00020\u000eH\u0002J\u001c\u0010ë\u0001\u001a\u00020\u001e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010~\u001a\u00030Å\u0001H\u0002J\u001c\u0010ì\u0001\u001a\u00020\u001e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010~\u001a\u00030Å\u0001H\u0002J\u001c\u0010í\u0001\u001a\u00020\u001e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010~\u001a\u00030Å\u0001H\u0002J\u001c\u0010î\u0001\u001a\u00020\u001e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010~\u001a\u00030Å\u0001H\u0002J\t\u0010ï\u0001\u001a\u00020\u001eH\u0002JG\u0010ð\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010;2\u0007\u0010Î\u0001\u001a\u00020\u000e2\u000e\u0010ñ\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010;2\u001c\b\u0002\u0010ò\u0001\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¨\u00010;0cH\u0002J)\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010;2\u0007\u0010Î\u0001\u001a\u00020\u000e2\u000e\u0010ô\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010;H\u0002J\"\u0010õ\u0001\u001a\u0005\u0018\u00010ö\u00012\n\u0010÷\u0001\u001a\u0005\u0018\u00010¨\u00012\b\u0010ø\u0001\u001a\u00030ù\u0001H\u0002J.\u0010ú\u0001\u001a\u00020\u000e2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010±\u0001\u001a\u00020\f2\u0007\u0010û\u0001\u001a\u00020\u000e2\u0007\u0010ü\u0001\u001a\u00020\u000eH\u0002J4\u0010ý\u0001\u001a\u0005\u0018\u0001Hþ\u0001\"\t\b\u0000\u0010þ\u0001*\u00020\u001b2\n\u0010\u009e\u0001\u001a\u0005\u0018\u0001Hþ\u00012\t\b\u0001\u0010ÿ\u0001\u001a\u00020\fH\u0002¢\u0006\u0003\u0010\u0080\u0002J\u0011\u0010\u0081\u0002\u001a\u00020\u001e2\u0006\u0010}\u001a\u00020\fH\u0002J\t\u0010\u0082\u0002\u001a\u00020\u001eH\u0002J\u0010\u0010\u0083\u0002\u001a\u0004\u0018\u00010-*\u00030¥\u0001H\u0002J\u0011\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0085\u0002*\u00030\u0086\u0002H\u0002J\u0010\u0010\u0087\u0002\u001a\u0004\u0018\u00010!*\u00030¨\u0001H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000204038@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010:\u001a&\u0012\f\u0012\n =*\u0004\u0018\u00010<0< =*\u0012\u0012\f\u0012\n =*\u0004\u0018\u00010<0<\u0018\u00010>0;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u00020@8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\u0016\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR6\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0Mj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`NX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR6\u0010S\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0Mj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`NX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR\u001a\u0010V\u001a\u00020\u000e8@X\u0081\u0004¢\u0006\f\u0012\u0004\bW\u0010\u0016\u001a\u0004\bX\u0010\u0010R\u0014\u0010Y\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0010R\u0014\u0010Z\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0010R\u0014\u0010[\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0010R \u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f030\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020^X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020\f0%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020d0c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\be\u0010\u0016\u001a\u0004\bf\u00106\"\u0004\bg\u00108R\u000e\u0010h\u001a\u00020dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010i\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010jR\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020l0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010o\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u001e0pX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020r0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010s\u001a\u00020t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010\u0016\u001a\u0004\bv\u0010wR\u000e\u0010x\u001a\u00020yX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u008f\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "", "getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release", "()Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release", "accessibilityCursorPosition", "", "accessibilityForceEnabledForTesting", "", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "()V", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "bufferedContentCaptureAppearedNodes", "Landroidx/collection/ArrayMap;", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "getBufferedContentCaptureAppearedNodes$ui_release", "()Landroidx/collection/ArrayMap;", "bufferedContentCaptureDisappearedNodes", "Landroidx/collection/ArraySet;", "getBufferedContentCaptureDisappearedNodes$ui_release", "()Landroidx/collection/ArraySet;", "checkingForSemanticsChanges", "contentCaptureForceEnabledForTesting", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "currentSemanticsNodes", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes$ui_release", "()Ljava/util/Map;", "setCurrentSemanticsNodes$ui_release", "(Ljava/util/Map;)V", "currentSemanticsNodesInvalidated", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getIdToAfterMap$ui_release", "()Ljava/util/HashMap;", "setIdToAfterMap$ui_release", "(Ljava/util/HashMap;)V", "idToBeforeMap", "getIdToBeforeMap$ui_release", "setIdToBeforeMap$ui_release", Constants.ENABLE_DISABLE, "isEnabled$ui_release$annotations", "isEnabled$ui_release", "isEnabledForAccessibility", "isEnabledForContentCapture", "isTouchExplorationEnabled", "labelToActionId", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "paneDisplayed", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "previousSemanticsNodes", "", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "getPreviousSemanticsNodes$ui_release$annotations", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scrollObservationScopes", "Landroidx/compose/ui/platform/ScrollObservationScope;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendScrollEventIfNeededLambda", "Lkotlin/Function1;", "subtreeChangedLayoutNodes", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bufferContentCaptureViewAppeared", "virtualId", "viewStructure", "bufferContentCaptureViewDisappeared", "canScroll", "vertical", "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "Landroid/view/accessibility/AccessibilityEvent;", "eventType", "createEvent$ui_release", "createNodeInfo", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "getAccessibilityNodeProvider", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAccessibilitySelectionStart", "getInfoIsCheckable", "getInfoStateDescriptionOrNull", "getInfoText", "Landroid/text/SpannableString;", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "isScreenReaderFocusable", "notifyContentCaptureChanges", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "notifySubtreeAppeared", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", NativeProtocol.WEB_DIALOG_ACTION, "populateAccessibilityNodeInfoProperties", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "semanticComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "layoutIsRtl", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "sendContentCaptureSemanticsStructureChangeEvents", "sendContentCaptureSemanticsStructureChangeEvents$ui_release", "sendContentCaptureTextUpdateEvent", "newText", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendScrollEventIfNeeded", "scrollObservationScope", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "setAccessibilitySelection", TtmlNode.START, TtmlNode.END, "traversalMode", "setContentInvalid", "setIsCheckable", "setStateDescription", "setText", "setTraversalValues", "sortByGeometryGroupings", "parentListToSort", "containerChildrenMapping", "subtreeSortedByGeometryGrouping", "listToSort", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", ExifInterface.GPS_DIRECTION_TRUE, "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "getContentCaptureSessionCompat", "getTextForTextField", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "toViewStructure", "Api24Impl", "Api28Impl", "Api29Impl", "Companion", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    private final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private final ArrayMap<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;
    private final ArraySet<Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;
    private ContentCaptureSessionCompat contentCaptureSession;
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private int hoveredVirtualViewId;
    private HashMap<Integer, Integer> idToAfterMap;
    private HashMap<Integer, Integer> idToBeforeMap;
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet<Integer> paneDisplayed;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private final Function1<ScrollObservationScope, Unit> sendScrollEventIfNeededLambda;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat<>();
        this.labelToActionId = new SparseArrayCompat<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>();
        this.boundsUpdateChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new ArraySet<>();
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new ArraySet<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().addAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().addTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat.getContentCaptureSessionCompat(view2));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().removeAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager$ui_release().removeTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener$ui_release());
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$45(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1(this);
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final android.view.accessibility.AccessibilityManager getAccessibilityManager$ui_release() {
        return this.accessibilityManager;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    public final AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener$ui_release() {
        return this.enabledStateListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        List<AccessibilityServiceInfo> emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            emptyList = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        this$0.enabledServices = emptyList;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener$ui_release() {
        return this.touchExplorationStateListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.enabledServices = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    public final boolean isEnabled$ui_release() {
        return isEnabledForAccessibility() || isEnabledForContentCapture();
    }

    private final boolean isEnabledForAccessibility() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> enabledServices = this.enabledServices;
            Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
            if (!enabledServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isEnabledForContentCapture() {
        return this.contentCaptureForceEnabledForTesting;
    }

    private final boolean isTouchExplorationEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.contentCaptureForceEnabledForTesting;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z) {
        this.contentCaptureForceEnabledForTesting = z;
    }

    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final ArrayMap<Integer, ViewStructureCompat> getBufferedContentCaptureAppearedNodes$ui_release() {
        return this.bufferedContentCaptureAppearedNodes;
    }

    public final ArraySet<Integer> getBufferedContentCaptureDisappearedNodes$ui_release() {
        return this.bufferedContentCaptureDisappearedNodes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", NativeProtocol.WEB_DIALOG_ACTION, "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    public final void setCurrentSemanticsNodes$ui_release(Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.currentSemanticsNodes = map;
    }

    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            setTraversalValues();
        }
        return this.currentSemanticsNodes;
    }

    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(HashMap<Integer, Integer> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.idToBeforeMap = hashMap;
    }

    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(HashMap<Integer, Integer> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.idToAfterMap = hashMap;
    }

    public final String getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release() {
        return this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    }

    public final String getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release() {
        return this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SemanticsNodeCopy {
        private final Set<Integer> children;
        private final SemanticsNode semanticsNode;
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
            this.children = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final Set<Integer> getChildren() {
            return this.children;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    public final void setPreviousSemanticsNodes$ui_release(Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }

    /* renamed from: canScroll-0AR0LA0$ui_release  reason: not valid java name */
    public final boolean m4840canScroll0AR0LA0$ui_release(boolean z, int i, long j) {
        return m4841canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes$ui_release().values(), z, i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[SYNTHETIC] */
    /* renamed from: canScroll-moWRBKg$ui_release  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4841canScrollmoWRBKg$ui_release(Collection<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean z, int i, long j) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        boolean z2;
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        if (Offset.m3015equalsimpl0(j, Offset.Companion.m3033getUnspecifiedF1C5BW0()) || !Offset.m3021isValidimpl(j)) {
            return false;
        }
        if (z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Collection<SemanticsNodeWithAdjustedBounds> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m3044containsk4lQ0M(j) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i2 = scrollAxisRange.getReverseScrolling() ? -i : i;
                if (i == 0 && scrollAxisRange.getReverseScrolling()) {
                    i2 = -1;
                }
                if (i2 >= 0 ? scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() : scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                    z2 = true;
                    continue;
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            continue;
            if (z2) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int i) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (i == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else if (semanticsNode.getParent() != null) {
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id = parent.getId();
            obtain.setParent(this.view, id != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id : -1);
        } else {
            throw new IllegalStateException("semanticsNode " + i + " has null parent");
        }
        obtain.setSource(this.view, i);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo4507localToScreenMKHz9U = this.view.mo4507localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo4507localToScreenMKHz9U2 = this.view.mo4507localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        obtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m3018getXimpl(mo4507localToScreenMKHz9U)), (int) Math.floor(Offset.m3019getYimpl(mo4507localToScreenMKHz9U)), (int) Math.ceil(Offset.m3018getXimpl(mo4507localToScreenMKHz9U2)), (int) Math.ceil(Offset.m3019getYimpl(mo4507localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(i, obtain, semanticsNode);
        return obtain.unwrap();
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z) {
        final Comparator compareBy = ComparisonsKt.compareBy(AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$2.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$4.INSTANCE);
        if (z) {
            compareBy = ComparisonsKt.compareBy(AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$2.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$3.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$4.INSTANCE);
        }
        final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.Companion.getZComparator$ui_release();
        final Comparator comparator = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = compareBy.compare(t, t2);
                return compare != 0 ? compare : zComparator$ui_release.compare(((SemanticsNode) t).getLayoutNode$ui_release(), ((SemanticsNode) t2).getLayoutNode$ui_release());
            }
        };
        return new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, List list, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, list, map);
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean z, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map) {
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode = list.get(i2);
                if (i2 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$1.INSTANCE, AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.INSTANCE));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            CollectionsKt.sortWith((List) pair.getSecond(), semanticComparator(z));
            arrayList2.addAll((Collection) pair.getSecond());
        }
        CollectionsKt.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                float getTraversalIndex;
                float getTraversalIndex2;
                getTraversalIndex = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getGetTraversalIndex((SemanticsNode) t);
                getTraversalIndex2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getGetTraversalIndex((SemanticsNode) t2);
                return ComparisonsKt.compareValues(Float.valueOf(getTraversalIndex), Float.valueOf(getTraversalIndex2));
            }
        });
        while (i <= CollectionsKt.getLastIndex(arrayList2)) {
            int id = ((SemanticsNode) arrayList2.get(i)).getId();
            List<SemanticsNode> list2 = map.get(Integer.valueOf(id));
            if (list2 != null) {
                arrayList2.remove(i);
                arrayList2.addAll(i, list2);
            }
            List<SemanticsNode> list3 = map.get(Integer.valueOf(id));
            i += list3 != null ? list3.size() : 1;
        }
        return arrayList2;
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(List<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        boolean overlaps;
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> rangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = list.get(i).getFirst();
                overlaps = AndroidComposeViewAccessibilityDelegateCompat_androidKt.overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(first.getTop(), first.getBottom()), rangeUntil);
                if (!overlaps) {
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                } else {
                    list.set(i, new Pair<>(first.intersect(new androidx.compose.ui.geometry.Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), list.get(i).getSecond()));
                    list.get(i).getSecond().add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(this, arrayList, linkedHashMap, z, list.get(i));
        }
        return sortByGeometryGroupings(z, arrayList, linkedHashMap);
    }

    private static final void subtreeSortedByGeometryGrouping$depthFirstSearch(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, boolean z, SemanticsNode semanticsNode) {
        Boolean isTraversalGroup;
        Boolean isTraversalGroup2;
        isTraversalGroup = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTraversalGroup(semanticsNode);
        if ((Intrinsics.areEqual((Object) isTraversalGroup, (Object) true) || androidComposeViewAccessibilityDelegateCompat.isScreenReaderFocusable(semanticsNode)) && androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes$ui_release().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            list.add(semanticsNode);
        }
        isTraversalGroup2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTraversalGroup(semanticsNode);
        if (Intrinsics.areEqual((Object) isTraversalGroup2, (Object) true)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.subtreeSortedByGeometryGrouping(z, CollectionsKt.toMutableList((Collection) semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(androidComposeViewAccessibilityDelegateCompat, list, map, z, children.get(i));
        }
    }

    private final void setTraversalValues() {
        boolean isRtl;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
        int i = 1;
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl, CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt.getLastIndex(subtreeSortedByGeometryGrouping);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
            this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
            this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
            if (i == lastIndex) {
                return;
            }
            i++;
        }
    }

    private final boolean isScreenReaderFocusable(SemanticsNode semanticsNode) {
        String infoContentDescriptionOrNull;
        infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
        return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && (infoContentDescriptionOrNull != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode) != null || getInfoIsCheckable(semanticsNode)));
    }

    public final void populateAccessibilityNodeInfoProperties(int i, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        boolean isTextField;
        String infoContentDescriptionOrNull;
        boolean isPassword;
        boolean isTextField2;
        boolean enabled;
        boolean isVisible;
        boolean enabled2;
        boolean enabled3;
        Map<CharSequence, Integer> map;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean isRtl2;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        boolean z;
        String m4843toLegacyClassNameV4PA4sw;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.setClassName(ClassName);
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.m4923unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                if (Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4930getTabo7Vup1c())) {
                    info.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else if (!Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4929getSwitcho7Vup1c())) {
                    m4843toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m4843toLegacyClassNameV4PA4sw(role.m4923unboximpl());
                    if (!Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4927getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        info.setClassName(m4843toLegacyClassNameV4PA4sw);
                    }
                } else {
                    info.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                }
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
        if (isTextField) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getText())) {
            info.setClassName(TextClassName);
        }
        info.setPackageName(this.view.getContext().getPackageName());
        info.setImportantForAccessibility(true);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    info.addChild(androidViewHolder);
                } else {
                    info.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == i) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        setStateDescription(semanticsNode, info);
        setIsCheckable(semanticsNode, info);
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.setChecked(false);
            }
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4930getTabo7Vup1c())) {
                info.setSelected(booleanValue);
            } else {
                info.setChecked(booleanValue);
            }
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
            info.setContentDescription(infoContentDescriptionOrNull);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z = false;
                    break;
                } else if (semanticsNode3.getUnmergedConfig$ui_release().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                    z = ((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue();
                    break;
                } else {
                    semanticsNode3 = semanticsNode3.getParent();
                }
            }
            if (z) {
                info.setViewIdResourceName(str);
            }
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            info.setHeading(true);
            Unit unit7 = Unit.INSTANCE;
            Unit unit8 = Unit.INSTANCE;
        }
        isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
        info.setPassword(isPassword);
        isTextField2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
        info.setEditable(isTextField2);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        info.setEnabled(enabled);
        info.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode);
        info.setVisibleToUser(isVisible);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int m4914unboximpl = liveRegionMode.m4914unboximpl();
            info.setLiveRegion((LiveRegionMode.m4911equalsimpl0(m4914unboximpl, LiveRegionMode.Companion.m4916getPolite0phEisY()) || !LiveRegionMode.m4911equalsimpl0(m4914unboximpl, LiveRegionMode.Companion.m4915getAssertive0phEisY())) ? 1 : 2);
            Unit unit9 = Unit.INSTANCE;
            Unit unit10 = Unit.INSTANCE;
        }
        info.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected()), (Object) true);
            info.setClickable(!areEqual);
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !areEqual) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit11 = Unit.INSTANCE;
            Unit unit12 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit13 = Unit.INSTANCE;
            Unit unit14 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit15 = Unit.INSTANCE;
            Unit unit16 = Unit.INSTANCE;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit17 = Unit.INSTANCE;
                Unit unit18 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPerformImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908372, accessibilityAction5.getLabel()));
                Unit unit19 = Unit.INSTANCE;
                Unit unit20 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit21 = Unit.INSTANCE;
                Unit unit22 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit23 = Unit.INSTANCE;
                Unit unit24 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    info.setMovementGranularities(info.getMovementGranularities() | 4 | 16);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = info.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
            AccessibilityNodeInfo unwrap = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap, "info.unwrap()");
            accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(unwrap, arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.addSetProgressAction(info, semanticsNode);
        }
        CollectionInfoKt.setCollectionInfo(semanticsNode, info);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl2) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    info.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    info.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(info, semanticsNode);
        }
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit25 = Unit.INSTANCE;
                Unit unit26 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit27 = Unit.INSTANCE;
                Unit unit28 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit29 = Unit.INSTANCE;
                Unit unit30 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.labelToActionId.containsKey(i)) {
                    Map<CharSequence, Integer> map2 = this.labelToActionId.get(i);
                    List<Integer> mutableList = ArraysKt.toMutableList(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i3);
                        Intrinsics.checkNotNull(map2);
                        if (map2.containsKey(customAccessibilityAction.getLabel())) {
                            Integer num = map2.get(customAccessibilityAction.getLabel());
                            Intrinsics.checkNotNull(num);
                            map = map2;
                            sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            mutableList.remove(num);
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            map = map2;
                            arrayList2.add(customAccessibilityAction);
                        }
                        i3++;
                        map2 = map;
                    }
                    int size4 = arrayList2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i4);
                        int intValue = mutableList.get(i4).intValue();
                        sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i5);
                        int i6 = AccessibilityActionsResourceIds[i5];
                        sparseArrayCompat.put(i6, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i6));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i6, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(i, sparseArrayCompat);
                this.labelToActionId.put(i, linkedHashMap);
            }
        }
        info.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i));
        if (num2 != null) {
            num2.intValue();
            View semanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                info.setTraversalBefore(semanticsIdToView);
            } else {
                info.setTraversalBefore(this.view, num2.intValue());
            }
            AccessibilityNodeInfo unwrap2 = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap2, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i, unwrap2, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL, null);
            Unit unit31 = Unit.INSTANCE;
            Unit unit32 = Unit.INSTANCE;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(i));
        if (num3 != null) {
            num3.intValue();
            View semanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                info.setTraversalAfter(semanticsIdToView2);
            } else {
                info.setTraversalAfter(this.view, num3.intValue());
            }
            AccessibilityNodeInfo unwrap3 = info.unwrap();
            Intrinsics.checkNotNullExpressionValue(unwrap3, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(i, unwrap3, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL, null);
            Unit unit33 = Unit.INSTANCE;
            Unit unit34 = Unit.INSTANCE;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode) {
        Object string;
        int i;
        Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1) {
                if ((role == null ? false : Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4929getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.on);
                }
            } else if (i2 == 2) {
                if ((role == null ? false : Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4929getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.off);
                }
            } else if (i2 == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4930getTabo7Vup1c())) && orNull == null) {
                if (booleanValue) {
                    orNull = this.view.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = this.view.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float coerceIn = RangesKt.coerceIn(((range.getEndInclusive().floatValue() - range.getStart().floatValue()) > 0.0f ? 1 : ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue()), 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        i = 0;
                    } else {
                        i = 100;
                        if (!(coerceIn == 1.0f)) {
                            i = RangesKt.coerceIn(MathKt.roundToInt(coerceIn * 100), 1, 99);
                        }
                    }
                    string = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i));
                    orNull = string;
                }
            } else if (orNull == null) {
                string = this.view.getContext().getResources().getString(R.string.in_progress);
                orNull = string;
            }
        }
        return (String) orNull;
    }

    private final void setStateDescription(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(getInfoStateDescriptionOrNull(semanticsNode));
    }

    private final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        boolean z = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            bool.booleanValue();
            return role != null ? Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4930getTabo7Vup1c()) : false ? z : true;
        }
        return z;
    }

    private final void setIsCheckable(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(getInfoIsCheckable(semanticsNode));
    }

    private final SpannableString getInfoText(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache) : null, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull((List<? extends Object>) list)) != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        }
        return spannableString2 == null ? (SpannableString) trimToSize(spannableString, 100000) : spannableString2;
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setText(getInfoText(semanticsNode));
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.focusedVirtualViewId == i;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (isTouchExplorationEnabled() && !isAccessibilityFocused(i)) {
            int i2 = this.focusedVirtualViewId;
            if (i2 != Integer.MIN_VALUE) {
                sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
            }
            this.focusedVirtualViewId = i;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i, 32768, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, i2);
        if (num != null) {
            createEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent$ui_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (isEnabledForAccessibility()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, accessibilityEvent);
        }
        return false;
    }

    public final AccessibilityEvent createEvent$ui_release(int i, int i2) {
        boolean isPassword;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds != null) {
            isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode());
            obtain.setPassword(isPassword);
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i, 8192);
        if (num != null) {
            createEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent$ui_release.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent$ui_release.getText().add(charSequence);
        }
        return createEvent$ui_release;
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (isAccessibilityFocused(i)) {
            this.focusedVirtualViewId = Integer.MIN_VALUE;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01a2 -> B:90:0x01a3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performActionHelper(int i, int i2, Bundle bundle) {
        SemanticsNode semanticsNode;
        Function0 function0;
        boolean enabled;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        float f;
        int i3;
        Function2 function2;
        boolean isRtl;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function1;
        AccessibilityAction accessibilityAction;
        boolean isRtl2;
        Function2 function22;
        SemanticsConfiguration config;
        SemanticsConfiguration config2;
        AccessibilityAction accessibilityAction2;
        Function1 function12;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        CharSequence charSequence;
        List list;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (i2 != 64) {
            if (i2 != 128) {
                boolean z = true;
                if (i2 == 256 || i2 == 512) {
                    if (bundle != null) {
                        return traverseAtGranularity(semanticsNode, bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), i2 == 256, bundle.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
                    }
                    return false;
                } else if (i2 == 16384) {
                    AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCopyText());
                    if (accessibilityAction3 == null || (function0 = (Function0) accessibilityAction3.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) function0.invoke()).booleanValue();
                } else if (i2 != 131072) {
                    enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                    if (enabled) {
                        if (i2 == 1) {
                            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getRequestFocus());
                            if (accessibilityAction4 == null || (function02 = (Function0) accessibilityAction4.getAction()) == null) {
                                return false;
                            }
                            return ((Boolean) function02.invoke()).booleanValue();
                        }
                        Boolean bool = null;
                        bool = null;
                        if (i2 != 2) {
                            switch (i2) {
                                case 16:
                                    AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnClick());
                                    if (accessibilityAction5 != null && (function03 = (Function0) accessibilityAction5.getAction()) != null) {
                                        bool = (Boolean) function03.invoke();
                                    }
                                    sendEventForVirtualView$default(this, i, 1, null, null, 12, null);
                                    if (bool != null) {
                                        return bool.booleanValue();
                                    }
                                    return false;
                                case 32:
                                    AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getOnLongClick());
                                    if (accessibilityAction6 == null || (function04 = (Function0) accessibilityAction6.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function04.invoke()).booleanValue();
                                case 4096:
                                case 8192:
                                    break;
                                case 32768:
                                    AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPasteText());
                                    if (accessibilityAction7 == null || (function05 = (Function0) accessibilityAction7.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function05.invoke()).booleanValue();
                                case 65536:
                                    AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCutText());
                                    if (accessibilityAction8 == null || (function06 = (Function0) accessibilityAction8.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function06.invoke()).booleanValue();
                                case 262144:
                                    AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getExpand());
                                    if (accessibilityAction9 == null || (function07 = (Function0) accessibilityAction9.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function07.invoke()).booleanValue();
                                case 524288:
                                    AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCollapse());
                                    if (accessibilityAction10 == null || (function08 = (Function0) accessibilityAction10.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function08.invoke()).booleanValue();
                                case 1048576:
                                    AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getDismiss());
                                    if (accessibilityAction11 == null || (function09 = (Function0) accessibilityAction11.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function09.invoke()).booleanValue();
                                case 2097152:
                                    String string = bundle != null ? bundle.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                                    AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetText());
                                    if (accessibilityAction12 == null || (function1 = (Function1) accessibilityAction12.getAction()) == null) {
                                        return false;
                                    }
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) function1.invoke(new AnnotatedString(string, null, null, 6, null))).booleanValue();
                                case 16908342:
                                    SemanticsNode parent = semanticsNode.getParent();
                                    if (parent != null && (config2 = parent.getConfig()) != null) {
                                        accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config2, SemanticsActions.INSTANCE.getScrollBy());
                                        while (parent != null && accessibilityAction == null) {
                                            parent = parent.getParent();
                                            if (parent != null && (config = parent.getConfig()) != null) {
                                                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getScrollBy());
                                            }
                                        }
                                        if (parent != null) {
                                            return false;
                                        }
                                        androidx.compose.ui.geometry.Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
                                        LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                                        androidx.compose.ui.geometry.Rect m3055translatek4lQ0M = boundsInParent.m3055translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.Companion.m3034getZeroF1C5BW0());
                                        androidx.compose.ui.geometry.Rect m3058Recttz77jQw = RectKt.m3058Recttz77jQw(semanticsNode.m4932getPositionInRootF1C5BW0(), IntSizeKt.m5777toSizeozmzZPI(semanticsNode.m4934getSizeYbymL2g()));
                                        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                                        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                                        float performActionHelper$scrollDelta = performActionHelper$scrollDelta(m3058Recttz77jQw.getLeft() - m3055translatek4lQ0M.getLeft(), m3058Recttz77jQw.getRight() - m3055translatek4lQ0M.getRight());
                                        if ((scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) != false) {
                                            performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                                        }
                                        isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                                        if (isRtl2) {
                                            performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                                        }
                                        float performActionHelper$scrollDelta2 = performActionHelper$scrollDelta(m3058Recttz77jQw.getTop() - m3055translatek4lQ0M.getTop(), m3058Recttz77jQw.getBottom() - m3055translatek4lQ0M.getBottom());
                                        if ((scrollAxisRange2 == null || !scrollAxisRange2.getReverseScrolling()) ? false : false) {
                                            performActionHelper$scrollDelta2 = -performActionHelper$scrollDelta2;
                                        }
                                        if (accessibilityAction == null || (function22 = (Function2) accessibilityAction.getAction()) == null) {
                                            return false;
                                        }
                                        return ((Boolean) function22.invoke(Float.valueOf(performActionHelper$scrollDelta), Float.valueOf(performActionHelper$scrollDelta2))).booleanValue();
                                    }
                                    accessibilityAction = null;
                                    while (parent != null) {
                                        parent = parent.getParent();
                                        if (parent != null) {
                                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getScrollBy());
                                        }
                                        accessibilityAction = null;
                                        while (parent != null) {
                                        }
                                    }
                                    if (parent != null) {
                                    }
                                    break;
                                case 16908349:
                                    if (bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (Function1) accessibilityAction2.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
                                case 16908372:
                                    AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPerformImeAction());
                                    if (accessibilityAction13 == null || (function010 = (Function0) accessibilityAction13.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) function010.invoke()).booleanValue();
                                default:
                                    switch (i2) {
                                        case 16908344:
                                        case 16908345:
                                        case 16908346:
                                        case 16908347:
                                            break;
                                        default:
                                            switch (i2) {
                                                case 16908358:
                                                    AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
                                                    if (accessibilityAction14 == null || (function011 = (Function0) accessibilityAction14.getAction()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function011.invoke()).booleanValue();
                                                case 16908359:
                                                    AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
                                                    if (accessibilityAction15 == null || (function012 = (Function0) accessibilityAction15.getAction()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function012.invoke()).booleanValue();
                                                case 16908360:
                                                    AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
                                                    if (accessibilityAction16 == null || (function013 = (Function0) accessibilityAction16.getAction()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                case 16908361:
                                                    AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
                                                    if (accessibilityAction17 == null || (function014 = (Function0) accessibilityAction17.getAction()) == null) {
                                                        return false;
                                                    }
                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                default:
                                                    SparseArrayCompat<CharSequence> sparseArrayCompat = this.actionIdToLabel.get(i);
                                                    if (sparseArrayCompat == null || (charSequence = sparseArrayCompat.get(i2)) == null || (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getCustomActions())) == null) {
                                                        return false;
                                                    }
                                                    int size = list.size();
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i4);
                                                        if (Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                            return customAccessibilityAction.getAction().invoke().booleanValue();
                                                        }
                                                    }
                                                    return false;
                                            }
                                    }
                            }
                            ?? r13 = i2 == 4096;
                            ?? r15 = i2 == 8192;
                            ?? r2 = i2 == 16908345;
                            ?? r4 = i2 == 16908347;
                            ?? r5 = i2 == 16908344;
                            ?? r14 = i2 == 16908346;
                            ?? r6 = r2 == true || r4 == true || r13 == true || r15 == true;
                            ?? r142 = r5 == true || r14 == true || r13 == true || r15 == true;
                            if (r13 != false || r15 != false) {
                                ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                                AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
                                if (progressBarRangeInfo != null && accessibilityAction18 != null) {
                                    float coerceAtLeast = RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                                    float coerceAtMost = RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                                    if (progressBarRangeInfo.getSteps() > 0) {
                                        f = coerceAtLeast - coerceAtMost;
                                        i3 = progressBarRangeInfo.getSteps() + 1;
                                    } else {
                                        f = coerceAtLeast - coerceAtMost;
                                        i3 = 20;
                                    }
                                    float f2 = f / i3;
                                    if (r15 != false) {
                                        f2 = -f2;
                                    }
                                    Function1 function13 = (Function1) accessibilityAction18.getAction();
                                    if (function13 != null) {
                                        return ((Boolean) function13.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f2))).booleanValue();
                                    }
                                    return false;
                                }
                            }
                            long m3051getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m3051getSizeNHjbRc();
                            AccessibilityAction accessibilityAction19 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollBy());
                            if (accessibilityAction19 == null) {
                                return false;
                            }
                            ScrollAxisRange scrollAxisRange3 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                            if (scrollAxisRange3 != null && r6 != false) {
                                float m3087getWidthimpl = Size.m3087getWidthimpl(m3051getSizeNHjbRc);
                                if (r2 != false || r15 != false) {
                                    m3087getWidthimpl = -m3087getWidthimpl;
                                }
                                if (scrollAxisRange3.getReverseScrolling()) {
                                    m3087getWidthimpl = -m3087getWidthimpl;
                                }
                                isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                                if (isRtl && (r2 != false || r4 != false)) {
                                    m3087getWidthimpl = -m3087getWidthimpl;
                                }
                                if (performActionHelper$canScroll(scrollAxisRange3, m3087getWidthimpl)) {
                                    Function2 function23 = (Function2) accessibilityAction19.getAction();
                                    if (function23 != null) {
                                        return ((Boolean) function23.invoke(Float.valueOf(m3087getWidthimpl), Float.valueOf(0.0f))).booleanValue();
                                    }
                                    return false;
                                }
                            }
                            ScrollAxisRange scrollAxisRange4 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                            if (scrollAxisRange4 == null || !r142 == true) {
                                return false;
                            }
                            float m3084getHeightimpl = Size.m3084getHeightimpl(m3051getSizeNHjbRc);
                            if (r5 != false || r15 != false) {
                                m3084getHeightimpl = -m3084getHeightimpl;
                            }
                            if (scrollAxisRange4.getReverseScrolling()) {
                                m3084getHeightimpl = -m3084getHeightimpl;
                            }
                            if (!performActionHelper$canScroll(scrollAxisRange4, m3084getHeightimpl) || (function2 = (Function2) accessibilityAction19.getAction()) == null) {
                                return false;
                            }
                            return ((Boolean) function2.invoke(Float.valueOf(0.0f), Float.valueOf(m3084getHeightimpl))).booleanValue();
                        } else if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), (Object) true)) {
                            FocusManager.CC.clearFocus$default(this.view.getFocusOwner(), false, 1, null);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                } else {
                    boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, bundle != null ? bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1) : -1, bundle != null ? bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
                    if (accessibilitySelection) {
                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
                    }
                    return accessibilitySelection;
                }
            }
            return clearAccessibilityFocus(i);
        }
        return requestAccessibilityFocus(i);
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(i));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(str, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(i));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
            }
        } else if (Intrinsics.areEqual(str, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
                    if (Intrinsics.areEqual((Object) (function1 != null ? (Boolean) function1.invoke(arrayList) : null), (Object) true)) {
                        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i4 = 0; i4 < i3; i4++) {
                            int i5 = i2 + i4;
                            if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                            }
                        }
                        accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                        return;
                    }
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
        } else if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag()) && bundle != null && Intrinsics.areEqual(str, ExtraDataTestTagKey)) {
            String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            }
        } else if (Intrinsics.areEqual(str, ExtraDataIdKey)) {
            accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m3055translatek4lQ0M = rect.m3055translatek4lQ0M(semanticsNode.m4932getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m3055translatek4lQ0M.overlaps(boundsInRoot) ? m3055translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect != null) {
            long mo4507localToScreenMKHz9U = this.view.mo4507localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
            long mo4507localToScreenMKHz9U2 = this.view.mo4507localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
            return new RectF(Offset.m3018getXimpl(mo4507localToScreenMKHz9U), Offset.m3019getYimpl(mo4507localToScreenMKHz9U), Offset.m3018getXimpl(mo4507localToScreenMKHz9U2), Offset.m3019getYimpl(mo4507localToScreenMKHz9U2));
        }
        return null;
    }

    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isTouchExplorationEnabled()) {
            int action = event.getAction();
            if (action == 7 || action == 9) {
                int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
                boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
                if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                    return dispatchGenericMotionEvent;
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                    updateHoveredVirtualView(Integer.MIN_VALUE);
                    return true;
                }
                return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            }
        }
        return false;
    }

    public final int hitTestSemanticsAt$ui_release(float f, float f2) {
        boolean isVisible;
        NodeChain nodes$ui_release;
        boolean z = true;
        Owner.CC.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        this.view.getRoot().m4688hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(f, f2), hitTestResult, (r13 & 4) != 0, (r13 & 8) != 0);
        Modifier.Node node = (Modifier.Node) CollectionsKt.lastOrNull((List<? extends Object>) hitTestResult);
        LayoutNode requireLayoutNode = node != null ? DelegatableNodeKt.requireLayoutNode(node) : null;
        if (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null || !nodes$ui_release.m4720hasH91voCI$ui_release(NodeKind.m4757constructorimpl(8))) {
            z = false;
        }
        if (z) {
            isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(requireLayoutNode, false));
            if (isVisible && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        boolean z = true;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t != null && t.length() != 0) {
            z = false;
        }
        if (z || t.length() <= i) {
            return t;
        }
        int i2 = i - 1;
        if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
            i = i2;
        }
        T t2 = (T) t.subSequence(0, i);
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$45(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Owner.CC.measureAndLayout$default(this$0.view, false, 1, null);
        this$0.checkForSemanticsChanges();
        this$0.checkingForSemanticsChanges = false;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:13:0x0035, B:25:0x0064, B:29:0x0076, B:31:0x007e, B:33:0x0087, B:34:0x008a, B:36:0x0090, B:38:0x0099, B:39:0x00aa, B:41:0x00b1, B:42:0x00ba, B:18:0x004e), top: B:51:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cd -> B:14:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop(Continuation<? super Unit> continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        ArraySet<Integer> arraySet;
        ChannelIterator<Unit> it;
        ArraySet<Integer> arraySet2;
        Object hasNext;
        try {
            if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                if ((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label -= Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            arraySet = new ArraySet<>();
                            it = this.boundsUpdateChannel.iterator();
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        arraySet = arraySet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arraySet2 = arraySet;
                        obj = hasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            if (androidComposeViewAccessibilityDelegateCompat.isEnabledForContentCapture()) {
                                androidComposeViewAccessibilityDelegateCompat.notifyContentCaptureChanges();
                            }
                            if (androidComposeViewAccessibilityDelegateCompat.isEnabledForAccessibility()) {
                                int size = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    LayoutNode valueAt = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.valueAt(i2);
                                    Intrinsics.checkNotNull(valueAt);
                                    androidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(valueAt, arraySet2);
                                }
                                arraySet2.clear();
                                if (!androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges) {
                                    androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = true;
                                    androidComposeViewAccessibilityDelegateCompat.handler.post(androidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker);
                                }
                            }
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                            if (DelayKt.delay(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arraySet = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo8817trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet<Integer> arraySet) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        LayoutNode findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes$ui_release().m4720hasH91voCI$ui_release(NodeKind.m4757constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE);
            }
            if (layoutNode == null || (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null) {
                return;
            }
            if (!collapsedSemantics$ui_release.isMergingSemanticsOfDescendants() && findClosestParentNode != null) {
                layoutNode = findClosestParentNode;
            }
            if (layoutNode != null) {
                int semanticsId = layoutNode.getSemanticsId();
                if (arraySet.add(Integer.valueOf(semanticsId))) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendContentCaptureSemanticsStructureChangeEvents$ui_release(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes$ui_release());
        updateSemanticsNodesCopyAndPanes();
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        ArraySet<? extends Integer> arraySet = new ArraySet<>();
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            Integer id = it.next();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(id);
            String str = null;
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            arraySet.add(id);
            Intrinsics.checkNotNullExpressionValue(id, "id");
            int intValue = id.intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(id);
            if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            }
            sendPaneChangeEvents(intValue, 32, str);
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes$ui_release().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendSemanticsPropertyChangeEvents$ui_release(Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        boolean isTextField;
        boolean isTextField2;
        boolean z;
        boolean isTextField3;
        boolean z2;
        AccessibilityEvent createTextSelectionChangedEvent;
        boolean isPassword;
        boolean isPassword2;
        boolean isPassword3;
        boolean isPassword4;
        String text;
        boolean accessibilityEquals;
        Map<Integer, SemanticsNodeWithAdjustedBounds> newSemanticsNodes = map;
        Intrinsics.checkNotNullParameter(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            if (semanticsNodeCopy != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = newSemanticsNodes.get(Integer.valueOf(intValue));
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                Intrinsics.checkNotNull(semanticsNode);
                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNode.getUnmergedConfig$ui_release().iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> next = it.next();
                    if (((Intrinsics.areEqual(next.getKey(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(next.getKey(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) ? registerScrollingId(intValue, arrayList) : false) || !Intrinsics.areEqual(next.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()))) {
                        SemanticsPropertyKey<?> key = next.getKey();
                        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getText())) {
                            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
                            AnnotatedString annotatedString = list != null ? (AnnotatedString) CollectionsKt.firstOrNull((List<? extends Object>) list) : null;
                            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                            AnnotatedString annotatedString2 = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull((List<? extends Object>) list2) : null;
                            if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                            }
                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getPaneTitle())) {
                            Object value = next.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) value;
                            if (semanticsNodeCopy.hasPaneTitle()) {
                                sendPaneChangeEvents(intValue, 8, str);
                            }
                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getStateDescription()) ? true : Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getToggleableState())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getSelected())) {
                            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getRole());
                            if (role == null ? false : Role.m4920equalsimpl0(role.m4923unboximpl(), Role.Companion.m4930getTabo7Vup1c())) {
                                if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true)) {
                                    AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 4);
                                    SemanticsNode copyWithMergingEnabled$ui_release = semanticsNode.copyWithMergingEnabled$ui_release();
                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                                    String fastJoinToString$default = list3 != null ? TempListUtilsKt.fastJoinToString$default(list3, ",", null, null, 0, null, null, 62, null) : null;
                                    List list4 = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getText());
                                    String fastJoinToString$default2 = list4 != null ? TempListUtilsKt.fastJoinToString$default(list4, ",", null, null, 0, null, null, 62, null) : null;
                                    if (fastJoinToString$default != null) {
                                        createEvent$ui_release.setContentDescription(fastJoinToString$default);
                                    }
                                    if (fastJoinToString$default2 != null) {
                                        createEvent$ui_release.getText().add(fastJoinToString$default2);
                                    }
                                    sendEvent(createEvent$ui_release);
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                                }
                            } else {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                            }
                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getContentDescription())) {
                            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                            Object value2 = next.getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) value2);
                        } else {
                            String str2 = "";
                            if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getEditableText())) {
                                isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
                                if (isTextField) {
                                    AnnotatedString textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                    String str3 = textForTextField != null ? textForTextField : "";
                                    AnnotatedString textForTextField2 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                    String str4 = textForTextField2 != null ? textForTextField2 : "";
                                    CharSequence trimToSize = trimToSize(str4, 100000);
                                    int length = str3.length();
                                    int length2 = str4.length();
                                    int coerceAtMost = RangesKt.coerceAtMost(length, length2);
                                    int i = 0;
                                    while (i < coerceAtMost && str3.charAt(i) == str4.charAt(i)) {
                                        i++;
                                    }
                                    int i2 = 0;
                                    while (i2 < coerceAtMost - i) {
                                        int i3 = coerceAtMost;
                                        if (str3.charAt((length - 1) - i2) != str4.charAt((length2 - 1) - i2)) {
                                            break;
                                        }
                                        i2++;
                                        coerceAtMost = i3;
                                    }
                                    int i4 = (length - i2) - i;
                                    int i5 = (length2 - i2) - i;
                                    isTextField2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode());
                                    if (isTextField2) {
                                        isPassword3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode());
                                        if (!isPassword3) {
                                            isPassword4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                            if (isPassword4) {
                                                z = true;
                                                isTextField3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode());
                                                if (isTextField3) {
                                                    isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode());
                                                    if (isPassword) {
                                                        isPassword2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                                        if (!isPassword2) {
                                                            z2 = true;
                                                            if (!z || z2) {
                                                                createTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 0, 0, Integer.valueOf(length2), trimToSize);
                                                            } else {
                                                                createTextSelectionChangedEvent = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 16);
                                                                createTextSelectionChangedEvent.setFromIndex(i);
                                                                createTextSelectionChangedEvent.setRemovedCount(i4);
                                                                createTextSelectionChangedEvent.setAddedCount(i5);
                                                                createTextSelectionChangedEvent.setBeforeText(str3);
                                                                createTextSelectionChangedEvent.getText().add(trimToSize);
                                                            }
                                                            createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                            sendEvent(createTextSelectionChangedEvent);
                                                            if (!z || z2) {
                                                                long m5086unboximpl = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl();
                                                                createTextSelectionChangedEvent.setFromIndex(TextRange.m5082getStartimpl(m5086unboximpl));
                                                                createTextSelectionChangedEvent.setToIndex(TextRange.m5077getEndimpl(m5086unboximpl));
                                                                sendEvent(createTextSelectionChangedEvent);
                                                            }
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (!z) {
                                                }
                                                createTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 0, 0, Integer.valueOf(length2), trimToSize);
                                                createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                sendEvent(createTextSelectionChangedEvent);
                                                if (!z) {
                                                }
                                                long m5086unboximpl2 = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl();
                                                createTextSelectionChangedEvent.setFromIndex(TextRange.m5082getStartimpl(m5086unboximpl2));
                                                createTextSelectionChangedEvent.setToIndex(TextRange.m5077getEndimpl(m5086unboximpl2));
                                                sendEvent(createTextSelectionChangedEvent);
                                            }
                                        }
                                    }
                                    z = false;
                                    isTextField3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode());
                                    if (isTextField3) {
                                    }
                                    z2 = false;
                                    if (!z) {
                                    }
                                    createTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 0, 0, Integer.valueOf(length2), trimToSize);
                                    createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                    sendEvent(createTextSelectionChangedEvent);
                                    if (!z) {
                                    }
                                    long m5086unboximpl22 = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl();
                                    createTextSelectionChangedEvent.setFromIndex(TextRange.m5082getStartimpl(m5086unboximpl22));
                                    createTextSelectionChangedEvent.setToIndex(TextRange.m5077getEndimpl(m5086unboximpl22));
                                    sendEvent(createTextSelectionChangedEvent);
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 2, null, 8, null);
                                }
                            } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                    str2 = text;
                                }
                                long m5086unboximpl3 = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl();
                                sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), Integer.valueOf(TextRange.m5082getStartimpl(m5086unboximpl3)), Integer.valueOf(TextRange.m5077getEndimpl(m5086unboximpl3)), Integer.valueOf(str2.length()), trimToSize(str2, 100000)));
                                sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                            } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                                ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, intValue);
                                Intrinsics.checkNotNull(findById);
                                findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                sendScrollEventIfNeeded(findById);
                            } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getFocused())) {
                                Object value3 = next.getValue();
                                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) value3).booleanValue()) {
                                    sendEvent(createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                }
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, 0, null, 8, null);
                            } else if (Intrinsics.areEqual(key, SemanticsActions.INSTANCE.getCustomActions())) {
                                List list5 = (List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getCustomActions());
                                List list6 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                                if (list6 != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    int size = list5.size();
                                    for (int i6 = 0; i6 < size; i6++) {
                                        linkedHashSet.add(((CustomAccessibilityAction) list5.get(i6)).getLabel());
                                    }
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    int size2 = list6.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        linkedHashSet2.add(((CustomAccessibilityAction) list6.get(i7)).getLabel());
                                    }
                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                        z3 = false;
                                    }
                                    z3 = true;
                                } else if (!list5.isEmpty()) {
                                    z3 = true;
                                }
                            } else {
                                if (next.getValue() instanceof AccessibilityAction) {
                                    Object value4 = next.getValue();
                                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()));
                                    z3 = !accessibilityEquals;
                                }
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    z3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy);
                }
                if (z3) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                }
                newSemanticsNodes = map;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i);
            if (newAutofillId == null) {
                throw new IllegalStateException("Invalid content capture ID".toString());
            }
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
        }
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(scrollObservationScope, this));
        }
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent$ui_release.setContentChangeTypes(i2);
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        sendEvent(createEvent$ui_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m4843toLegacyClassNameV4PA4sw(r1.m4923unboximpl());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String m4843toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(parent.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        Intrinsics.checkNotNullExpressionValue(autofillId2, "if (parentNode != null) ….toAutofillId()\n        }");
        ViewStructureCompat newVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (newVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        if (unmergedConfig$ui_release.contains(SemanticsProperties.INSTANCE.getPassword())) {
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            newVirtualViewStructure.setClassName(TextClassName);
            newVirtualViewStructure.setText(TempListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getEditableText());
        if (annotatedString != null) {
            newVirtualViewStructure.setClassName(TextFieldClassName);
            newVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getContentDescription());
        if (list2 != null) {
            newVirtualViewStructure.setContentDescription(TempListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getRole());
        if (role != null && m4843toLegacyClassNameV4PA4sw != null) {
            newVirtualViewStructure.setClassName(m4843toLegacyClassNameV4PA4sw);
        }
        androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
        newVirtualViewStructure.setDimens((int) boundsInWindow.getLeft(), (int) boundsInWindow.getTop(), 0, 0, (int) boundsInWindow.getWidth(), (int) boundsInWindow.getHeight());
        return newVirtualViewStructure;
    }

    private final void bufferContentCaptureViewAppeared(int i, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(i))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(i));
            return;
        }
        this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(i), viewStructureCompat);
    }

    private final void bufferContentCaptureViewDisappeared(int i) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(i))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(i));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(i));
        }
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
                Collection<ViewStructureCompat> values = this.bufferedContentCaptureAppearedNodes.values();
                Intrinsics.checkNotNullExpressionValue(values, "bufferedContentCaptureAppearedNodes.values");
                List list = CollectionsKt.toList(values);
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((ViewStructureCompat) list.get(i)).toViewStructure());
                }
                contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
                this.bufferedContentCaptureAppearedNodes.clear();
            }
            if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
                List list2 = CollectionsKt.toList(this.bufferedContentCaptureDisappearedNodes);
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(Long.valueOf(((Integer) list2.get(i2)).intValue()));
                }
                contentCaptureSessionCompat.notifyViewsDisappeared(CollectionsKt.toLongArray(arrayList2));
                this.bufferedContentCaptureDisappearedNodes.clear();
            }
        }
    }

    private final void notifySubtreeAppeared(SemanticsNode semanticsNode) {
        bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            notifySubtreeAppeared(replacedChildren$ui_release.get(i));
        }
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        for (Integer num : semanticsNodeCopy.getChildren()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy2);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    public final void sendContentCaptureSemanticsStructureChangeEvents$ui_release(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        Intrinsics.checkNotNullParameter(newNode, "newNode");
        Intrinsics.checkNotNullParameter(oldNode, "oldNode");
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode.getId())) && !oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                notifySubtreeAppeared(semanticsNode);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes$ui_release().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendContentCaptureSemanticsStructureChangeEvents$ui_release(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i2;
        int i3;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        String str = iterableTextForAccessibility;
        if ((str == null || str.length() == 0) || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (following == null) {
            return false;
        }
        int i4 = following[0];
        int i5 = following[1];
        if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
            i2 = getAccessibilitySelectionStart(semanticsNode);
            if (i2 == -1) {
                i2 = z ? i4 : i5;
            }
            i3 = z ? i5 : i4;
        } else {
            i2 = z ? i5 : i4;
            i3 = i2;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? 256 : 512, i, i4, i5, SystemClock.uptimeMillis());
        setAccessibilitySelection(semanticsNode, i2, i3, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent$ui_release.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent$ui_release.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent$ui_release.setAction(pendingTextTraversedEvent.getAction());
                createEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent$ui_release);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        boolean enabled;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
                if (function3 != null) {
                    return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
                }
                return false;
            }
        }
        if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        this.accessibilityCursorPosition = (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) ? -1 : -1;
        String str = iterableTextForAccessibility;
        boolean z2 = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m5082getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m5077getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m5086unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        return !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        AccessibilityIterators.AbstractTextSegmentIterator companion;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion2 = AccessibilityIterators.CharacterTextSegmentIterator.Companion;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            companion = companion2.getInstance(locale);
            companion.initialize(iterableTextForAccessibility);
        } else if (i == 2) {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion3 = AccessibilityIterators.WordTextSegmentIterator.Companion;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            companion = companion3.getInstance(locale2);
            companion.initialize(iterableTextForAccessibility);
        } else {
            if (i != 4) {
                if (i == 8) {
                    companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                    companion.initialize(iterableTextForAccessibility);
                } else if (i != 16) {
                    return null;
                }
            }
            if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getGetTextLayoutResult())).getAction();
            if (!Intrinsics.areEqual((Object) (function1 != null ? (Boolean) function1.invoke(arrayList) : null), (Object) true)) {
                return null;
            }
            TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
            if (i == 4) {
                companion = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                AccessibilityIterators.AbstractTextSegmentIterator companion4 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) companion4).initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                companion = companion4;
            }
        }
        return companion;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        boolean isTextField;
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
            if (isTextField) {
                AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                if (textForTextField != null) {
                    return textForTextField.getText();
                }
                return null;
            }
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
            if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull((List<? extends Object>) list)) == null) {
                return null;
            }
            return annotatedString.getText();
        }
        return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", NativeProtocol.WEB_DIALOG_ACTION, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, info, extraDataKey, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "setScrollEventDelta", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @JvmStatic
        public static final void setScrollEventDelta(AccessibilityEvent event, int i, int i2) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(i);
            event.setScrollDeltaY(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.getLabel()));
                }
            }
        }
    }
}

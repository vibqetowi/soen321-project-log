package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000í\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b5\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)*\u0001H\b\u0000\u0018\u00002\u00020\u0001:\u0004ð\u0002ñ\u0002Bí\u0001\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012Y\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012Y\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u0010\u0099\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u009a\u0001\u001a\u00020\u0014H\u0002JK\u0010\u009b\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009c\u0001\"\u0005\b\u0001\u0010\u009d\u00012\b\u0010\u009e\u0001\u001a\u0003H\u009c\u00012\"\u0010\u009f\u0001\u001a\u001d\u0012\u0005\u0012\u0003H\u009d\u0001\u0012\u0005\u0012\u0003H\u009c\u0001\u0012\u0004\u0012\u00020\u00140 \u0001¢\u0006\u0003\b¡\u0001H\u0016¢\u0006\u0003\u0010¢\u0001J\t\u0010£\u0001\u001a\u00020\u0005H\u0016J5\u0010¤\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0000\u0010\u009d\u00012\u0007\u0010¥\u0001\u001a\u00020!2\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¦\u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010§\u0001J\u0014\u0010¨\u0001\u001a\u00020!2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010LH\u0017J\u0012\u0010¨\u0001\u001a\u00020!2\u0007\u0010\u009e\u0001\u001a\u00020!H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030©\u0001H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030ª\u0001H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030«\u0001H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030¬\u0001H\u0017J\u0012\u0010¨\u0001\u001a\u00020!2\u0007\u0010\u009e\u0001\u001a\u00020%H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030\u00ad\u0001H\u0017J\u0013\u0010¨\u0001\u001a\u00020!2\b\u0010\u009e\u0001\u001a\u00030®\u0001H\u0017J\u0014\u0010¯\u0001\u001a\u00020!2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010LH\u0017J\u000f\u0010°\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b±\u0001J\t\u0010²\u0001\u001a\u00020\u0014H\u0002J\t\u0010³\u0001\u001a\u00020\u0014H\u0002J\t\u0010´\u0001\u001a\u00020\u0014H\u0016JG\u0010µ\u0001\u001a\u00020\u00142\u001d\u0010¶\u0001\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020L\u0018\u00010¸\u00010·\u00012\u0014\u0010¹\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u00140¦\u0001¢\u0006\u0003\bº\u0001H\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J$\u0010½\u0001\u001a\u00020%2\u0007\u0010¾\u0001\u001a\u00020%2\u0007\u0010¿\u0001\u001a\u00020%2\u0007\u0010À\u0001\u001a\u00020%H\u0002J(\u0010Á\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0000\u0010\u009d\u00012\u000f\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010Ã\u0001H\u0017¢\u0006\u0003\u0010Ä\u0001J\t\u0010Å\u0001\u001a\u00020\u0014H\u0002J!\u0010Æ\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u009d\u00012\u000f\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¦\u0001H\u0016J\t\u0010È\u0001\u001a\u00020tH\u0002J\u0012\u0010È\u0001\u001a\u00020t2\u0007\u0010¾\u0001\u001a\u00020%H\u0002J\u0012\u0010É\u0001\u001a\u00020\u00142\u0007\u0010¨\u0001\u001a\u00020!H\u0017J\t\u0010Ê\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ë\u0001\u001a\u00020\u0014H\u0016J\u000f\u0010Ì\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\bÍ\u0001JF\u0010Î\u0001\u001a\u00020\u00142\u001d\u0010¶\u0001\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020L\u0018\u00010¸\u00010·\u00012\u0016\u0010¹\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010¦\u0001¢\u0006\u0003\bº\u0001H\u0002¢\u0006\u0003\u0010¼\u0001J\u001b\u0010Ï\u0001\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020%2\u0007\u0010Ð\u0001\u001a\u00020%H\u0002J\t\u0010Ñ\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010Ò\u0001\u001a\u00020\u00142\u0007\u0010Ó\u0001\u001a\u00020!H\u0002J\t\u0010Ô\u0001\u001a\u00020\u0014H\u0017J\t\u0010Õ\u0001\u001a\u00020\u0014H\u0002J\t\u0010Ö\u0001\u001a\u00020\u0014H\u0017J\t\u0010×\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ø\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ù\u0001\u001a\u00020\u0014H\u0017J\f\u0010Ú\u0001\u001a\u0005\u0018\u00010Û\u0001H\u0017J\t\u0010Ü\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ý\u0001\u001a\u00020\u0014H\u0002J\u0012\u0010Þ\u0001\u001a\u00020\u00142\u0007\u0010ß\u0001\u001a\u00020%H\u0016J\t\u0010à\u0001\u001a\u00020\u0014H\u0002J\u001d\u0010á\u0001\u001a\u00020\u00142\u0007\u0010Ó\u0001\u001a\u00020!2\t\u0010â\u0001\u001a\u0004\u0018\u00010vH\u0002J\u001a\u0010ã\u0001\u001a\u00020\u00142\u0007\u0010ä\u0001\u001a\u00020%2\u0006\u0010a\u001a\u00020!H\u0002J\t\u0010å\u0001\u001a\u00020\u0014H\u0002J\u000e\u0010O\u001a\u00020!H\u0000¢\u0006\u0003\bæ\u0001J\"\u0010ç\u0001\u001a\u00020\u00142\f\u0010\u009e\u0001\u001a\u0007\u0012\u0002\b\u00030è\u00012\t\u0010é\u0001\u001a\u0004\u0018\u00010LH\u0017J*\u0010ê\u0001\u001a\u00020\u00142\u001f\u0010ë\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030î\u0001\u0012\u0007\u0012\u0005\u0018\u00010î\u00010í\u00010ì\u0001H\u0002J*\u0010ï\u0001\u001a\u00020\u00142\u001f\u0010ë\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030î\u0001\u0012\u0007\u0012\u0005\u0018\u00010î\u00010í\u00010ì\u0001H\u0017J\u0012\u0010ð\u0001\u001a\u00020%2\u0007\u0010ñ\u0001\u001a\u00020%H\u0002J8\u0010ò\u0001\u001a\u00020\u00142\u0010\u0010¹\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010L0è\u00012\u0007\u0010ó\u0001\u001a\u00020t2\t\u0010é\u0001\u001a\u0004\u0018\u00010L2\u0007\u0010ô\u0001\u001a\u00020!H\u0002J\u001f\u0010õ\u0001\u001a\u00020L2\t\u0010ö\u0001\u001a\u0004\u0018\u00010L2\t\u0010÷\u0001\u001a\u0004\u0018\u00010LH\u0017J\u000b\u0010ø\u0001\u001a\u0004\u0018\u00010LH\u0001J-\u0010ù\u0001\u001a\u00020%2\u0007\u0010ú\u0001\u001a\u00020%2\u0007\u0010¾\u0001\u001a\u00020%2\u0007\u0010¿\u0001\u001a\u00020%2\u0007\u0010û\u0001\u001a\u00020%H\u0002J\u000f\u0010ü\u0001\u001a\u00020%H\u0000¢\u0006\u0003\bý\u0001J\u001f\u0010þ\u0001\u001a\u00020\u00142\u000e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140¦\u0001H\u0000¢\u0006\u0003\bÿ\u0001J\t\u0010\u0080\u0002\u001a\u00020\u0014H\u0002J!\u0010\u0080\u0002\u001a\u00020\u00142\u0010\u0010\u0081\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010L0\u0082\u0002H\u0002¢\u0006\u0003\u0010\u0083\u0002J\t\u0010\u0084\u0002\u001a\u00020\u0014H\u0002J\u0014\u0010\u0085\u0002\u001a\u00020\u00142\t\b\u0002\u0010\u0086\u0002\u001a\u00020!H\u0002J\t\u0010\u0087\u0002\u001a\u00020\u0014H\u0002J.\u0010\u0088\u0002\u001a\u00020!2\u001d\u0010¶\u0001\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020L\u0018\u00010¸\u00010·\u0001H\u0000¢\u0006\u0003\b\u0089\u0002Jv\u0010\u008a\u0002\u001a\u0003H\u008b\u0002\"\u0005\b\u0000\u0010\u008b\u00022\u000b\b\u0002\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010ñ\u0001\u001a\u0004\u0018\u00010%2%\b\u0002\u0010e\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020<\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020L\u0018\u00010¸\u00010í\u00010ì\u00012\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008b\u00020¦\u0001H\u0002¢\u0006\u0003\u0010\u008e\u0002J\t\u0010\u008f\u0002\u001a\u00020\u0014H\u0002J_\u0010\u0090\u0002\u001a\u00020\u00142T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J_\u0010\u0092\u0002\u001a\u00020\u00142T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u0093\u0002\u001a\u00020\u0014H\u0002J\u0014\u0010\u0094\u0002\u001a\u00020\u00142\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010LH\u0002J\t\u0010\u0095\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0096\u0002\u001a\u00020\u0014H\u0002J_\u0010\u0097\u0002\u001a\u00020\u00142T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\u0012\u0010\u0098\u0002\u001a\u00020\u00142\u0007\u0010\u0099\u0002\u001a\u00020YH\u0002J_\u0010\u009a\u0002\u001a\u00020\u00142T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J$\u0010\u009b\u0002\u001a\u00020\u00142\u0007\u0010\u008c\u0002\u001a\u00020%2\u0007\u0010\u008d\u0002\u001a\u00020%2\u0007\u0010\u009c\u0002\u001a\u00020%H\u0002J\u0012\u0010\u009d\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020%H\u0002J\u001a\u0010\u009f\u0002\u001a\u00020\u00142\u0006\u0010q\u001a\u00020%2\u0007\u0010\u009c\u0002\u001a\u00020%H\u0002J\u0019\u0010 \u0002\u001a\u00020\u00142\u000e\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140¦\u0001H\u0016J\t\u0010¢\u0002\u001a\u00020\u0014H\u0002J_\u0010£\u0002\u001a\u00020\u00142T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002Jj\u0010¤\u0002\u001a\u00020\u00142\t\b\u0002\u0010\u0086\u0002\u001a\u00020!2T\u0010\u0091\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010¥\u0002\u001a\u00020\u0014H\u0002J$\u0010¦\u0002\u001a\u00020\u00142\u0007\u0010§\u0002\u001a\u00020%2\u0007\u0010¨\u0002\u001a\u00020%2\u0007\u0010©\u0002\u001a\u00020%H\u0002J\u0013\u0010ª\u0002\u001a\u00020\u00142\b\u0010«\u0002\u001a\u00030\u0085\u0001H\u0016J\t\u0010¬\u0002\u001a\u00020\u0014H\u0002J\u001b\u0010\u00ad\u0002\u001a\u00020\u00142\b\u0010®\u0002\u001a\u00030î\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000b\u0010¯\u0002\u001a\u0004\u0018\u00010LH\u0016J\t\u0010°\u0002\u001a\u00020\u0014H\u0002J\u0012\u0010±\u0002\u001a\u00020\u00142\u0007\u0010²\u0002\u001a\u00020%H\u0002J\t\u0010³\u0002\u001a\u00020\u0014H\u0017J\t\u0010´\u0002\u001a\u00020\u0014H\u0002J\t\u0010µ\u0002\u001a\u00020\u0014H\u0002J\t\u0010¶\u0002\u001a\u00020\u0014H\u0017J\u0013\u0010·\u0002\u001a\u00020\u00142\b\u0010·\u0002\u001a\u00030¸\u0002H\u0017J\t\u0010¹\u0002\u001a\u00020\u0014H\u0017J\u001c\u0010º\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%2\b\u0010·\u0002\u001a\u00030¸\u0002H\u0017JA\u0010»\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%2\t\u0010¼\u0002\u001a\u0004\u0018\u00010L2\b\u0010½\u0002\u001a\u00030¾\u00022\t\u0010¿\u0002\u001a\u0004\u0018\u00010LH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\t\u0010Â\u0002\u001a\u00020\u0014H\u0017J\u0012\u0010Ã\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%H\u0002J\u001d\u0010Ã\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%2\t\u0010Ä\u0002\u001a\u0004\u0018\u00010LH\u0002J\u001d\u0010Å\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%2\t\u0010Ä\u0002\u001a\u0004\u0018\u00010LH\u0017J\t\u0010Æ\u0002\u001a\u00020\u0014H\u0016J&\u0010Ç\u0002\u001a\u00020\u00142\u0015\u0010È\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030É\u00020\u0082\u0002H\u0017¢\u0006\u0003\u0010Ê\u0002J\u001d\u0010Ë\u0002\u001a\u00020\u00142\u0007\u0010Ó\u0001\u001a\u00020!2\t\u0010¿\u0002\u001a\u0004\u0018\u00010LH\u0002J\u0012\u0010Ì\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%H\u0017J\u0012\u0010Í\u0002\u001a\u00020\u00012\u0007\u0010Â\u0001\u001a\u00020%H\u0017J\u001d\u0010Î\u0002\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020%2\t\u0010Ä\u0002\u001a\u0004\u0018\u00010LH\u0016J\t\u0010Ï\u0002\u001a\u00020\u0014H\u0016J\t\u0010Ð\u0002\u001a\u00020\u0014H\u0002J#\u0010Ñ\u0002\u001a\u00020!2\u0007\u0010«\u0002\u001a\u00020<2\t\u0010Ò\u0002\u001a\u0004\u0018\u00010LH\u0000¢\u0006\u0003\bÓ\u0002J\u0014\u0010Ô\u0002\u001a\u00020\u00142\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010LH\u0001J(\u0010Õ\u0002\u001a\u00020\u00142\u0007\u0010Ö\u0002\u001a\u00020%2\t\u0010Ä\u0002\u001a\u0004\u0018\u00010L2\t\u0010¿\u0002\u001a\u0004\u0018\u00010LH\u0002J\u0012\u0010×\u0002\u001a\u00020\u00142\u0007\u0010Ø\u0002\u001a\u00020%H\u0002J(\u0010Ù\u0002\u001a\u00020\u00142\u0007\u0010Ö\u0002\u001a\u00020%2\t\u0010Ä\u0002\u001a\u0004\u0018\u00010L2\t\u0010¿\u0002\u001a\u0004\u0018\u00010LH\u0002J\u0012\u0010Ú\u0002\u001a\u00020\u00142\u0007\u0010Ö\u0002\u001a\u00020%H\u0002J\u001b\u0010Û\u0002\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020%2\u0007\u0010\u009c\u0002\u001a\u00020%H\u0002J\u001b\u0010Ü\u0002\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020%2\u0007\u0010Ý\u0002\u001a\u00020%H\u0002J\u001b\u0010Þ\u0002\u001a\u00020t2\u0007\u0010ß\u0002\u001a\u00020t2\u0007\u0010à\u0002\u001a\u00020tH\u0002J\u0014\u0010á\u0002\u001a\u00020\u00142\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010LH\u0016J\u0014\u0010â\u0002\u001a\u00020\u00142\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010LH\u0001J\u0012\u0010ã\u0002\u001a\u00020%2\u0007\u0010¾\u0001\u001a\u00020%H\u0002J\t\u0010ä\u0002\u001a\u00020\u0014H\u0016J\t\u0010å\u0002\u001a\u00020\u0014H\u0002J\t\u0010æ\u0002\u001a\u00020\u0014H\u0002J\u000f\u0010ç\u0002\u001a\u00020\u0014H\u0000¢\u0006\u0003\bè\u0002J\u0085\u0001\u0010é\u0002\u001a\u0003H\u008b\u0002\"\u0005\b\u0000\u0010\u008b\u00022Z\u0010ê\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f2\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008b\u00020¦\u0001H\u0082\b¢\u0006\u0003\u0010ë\u0002J3\u0010ì\u0002\u001a\u0003H\u008b\u0002\"\u0005\b\u0000\u0010\u008b\u00022\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008b\u00020¦\u0001H\u0082\b¢\u0006\u0003\u0010í\u0002J\u0017\u0010î\u0002\u001a\u00020%*\u00030\u0083\u00012\u0007\u0010¾\u0001\u001a\u00020%H\u0002J\u0019\u0010ï\u0002\u001a\u0004\u0018\u00010L*\u00030\u0083\u00012\u0007\u0010ñ\u0001\u001a\u00020%H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'Ra\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020%8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u0010'R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010'R\u0016\u0010;\u001a\u0004\u0018\u00010<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020!8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u00103\u001a\u0004\bA\u0010#Ro\u0010B\u001aW\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0004\n\u0002\u0010IR\u0016\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0KX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010S\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bT\u0010#R\u0014\u0010U\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010#R\u000e\u0010W\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000Ra\u0010Z\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010[\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_Ra\u0010`\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150KX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010a\u001a\u00020!2\u0006\u00100\u001a\u00020!8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bb\u00103\u001a\u0004\bc\u0010#R\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020<0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010g\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bh\u0010#R\u001e\u0010i\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010#Ra\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010k\u001a\u0004\u0018\u00010lX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010m\u001a\"\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010nj\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u0001`oX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010u\u001a\u0004\u0018\u00010vX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010}\u001a\u0004\u0018\u00010tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010~\u001a\b\u0012\u0004\u0012\u00020t0\u007fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u000f\u0010\u008b\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u008d\u0001\u001a\u00020!8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u00103\u001a\u0005\b\u008f\u0001\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0096\u0001\u001a\u0004\u0018\u00010L*\u00030\u0083\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ò\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "deferredChanges", "getDeferredChanges$runtime_release", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "derivedStateObserver", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "downNodes", "Landroidx/compose/runtime/Stack;", "", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "implicitRootStart", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertUpFixups", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "invalidations", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "pendingUps", "previousCount", "previousMoveFrom", "previousMoveTo", "previousRemove", "providerCache", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "sourceInformationEnabled", "startedGroup", "startedGroups", "writer", "writerHasAProvider", "writersReaderDelta", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "addRecomposeScope", "apply", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changedInstance", "changesApplied", "changesApplied$runtime_release", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", TtmlNode.END, "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endRoot", "endToMarker", "marker", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceRecomposeScopes$runtime_release", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentGuarded", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "insertedGroupVirtualIndex", FirebaseAnalytics.Param.INDEX, "invokeMovableContentLambda", "locals", "force", "joinKey", "left", TtmlNode.RIGHT, "nextSlot", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime_release", "prepareCompose", "prepareCompose$runtime_release", "realizeDowns", "nodes", "", "([Ljava/lang/Object;)V", "realizeMovement", "realizeOperationLocation", "forParent", "realizeUps", "recompose", "recompose$runtime_release", "recomposeMovableContent", "R", "from", "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "record", "change", "recordApplierOperation", "recordDelete", "recordDown", "recordEndGroup", "recordEndRoot", "recordFixup", "recordInsert", "anchor", "recordInsertUpFixup", "recordMoveNode", "count", "recordReaderMoving", FirebaseAnalytics.Param.LOCATION, "recordRemoveNode", "recordSideEffect", "effect", "recordSlotEditing", "recordSlotEditingOperation", "recordSlotTableOperation", "recordUp", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "registerInsertUpFixup", "releaseMovableGroupAtCurrent", "reference", "rememberedValue", "reportAllMovableContent", "reportFreeMovableContent", "groupBeingRemoved", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", TtmlNode.START, "objectKey", "kind", "Landroidx/compose/runtime/GroupKind;", "data", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProviders", "values", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "verifyConsistent", "verifyConsistent$runtime_release", "withChanges", "newChanges", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private Stack<Object> downNodes;
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;
    private SlotTable insertTable;
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack;
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;
    private int[] nodeCountOverrides;
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack;
    private final CompositionContext parentContext;
    private PersistentCompositionLocalMap parentProvider;
    private Pending pending;
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private PersistentCompositionLocalMap providerCache;
    private final IntMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private final SlotTable slotTable;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int insertedGroupVirtualIndex(int i) {
        return (-2) - i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> applier, CompositionContext parentContext, SlotTable slotTable, Set<RememberObserver> abandonSet, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges, ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        this.providerUpdates = new IntMap<>(0, 1, null);
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.sourceInformationEnabled = true;
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                ComposerImpl.this.childrenComposing++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                ComposerImpl composerImpl = ComposerImpl.this;
                composerImpl.childrenComposing--;
            }
        };
        this.invalidateStack = new Stack<>();
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    public final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime_release(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        this.deferredChanges = list;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i) {
        m2863startBaiHCIY(i, null, GroupKind.Companion.m2875getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m2863startBaiHCIY(-127, null, GroupKind.Companion.m2875getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i, Object obj) {
        m2863startBaiHCIY(i, obj, GroupKind.Companion.m2875getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        this.insertFixups.clear();
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    public final void changesApplied$runtime_release() {
        createFreshInsertTable();
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (getInserting() || this.reusing || this.providersInvalid) {
            return false;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return (currentRecomposeScope$runtime_release != null && !currentRecomposeScope$runtime_release.getRequiresRecompose()) && !this.forciblyRecompose;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    private final void startGroup(int i) {
        m2863startBaiHCIY(i, null, GroupKind.Companion.m2875getGroupULZAiWs(), null);
    }

    private final void startGroup(int i, Object obj) {
        m2863startBaiHCIY(i, obj, GroupKind.Companion.m2875getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m2863startBaiHCIY(125, null, GroupKind.Companion.m2876getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m2863startBaiHCIY(125, null, GroupKind.Companion.m2877getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            recordFixup(new ComposerImpl$createNode$2(factory, anchor, peek));
            recordInsertUpFixup(new ComposerImpl$createNode$3(anchor, peek));
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            Object node = getNode(this.reader);
            recordDown(node);
            if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
                recordApplierOperation(ComposerImpl$useNode$2.INSTANCE);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i, Object obj) {
        if (this.reader.getGroupKey() == i && !Intrinsics.areEqual(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m2863startBaiHCIY(i, null, GroupKind.Companion.m2875getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i2) {
                    return;
                }
                end(slotWriter.isNode(parent));
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i) {
                    return;
                }
                end(slotReader.isNode(parent2));
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v, Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(block, v);
        if (getInserting()) {
            recordFixup(composerImpl$apply$operation$1);
        } else {
            recordApplierOperation(composerImpl$apply$operation$1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.Companion.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.Companion.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (Intrinsics.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() != obj) {
            updateValue(obj);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Float) {
            if (f == ((Number) nextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Double) {
            if (d == ((Number) nextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) nextSlot();
        if (t == Composer.Companion.getEmpty() || z) {
            T invoke = block.invoke();
            updateValue(invoke);
            return invoke;
        }
        return t;
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            if (obj instanceof RememberObserver) {
                record(new ComposerImpl$updateValue$1(obj));
                this.abandonSet.add(obj);
                return;
            }
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (obj instanceof RememberObserver) {
            this.abandonSet.add(obj);
        }
        recordSlotTableOperation(true, new ComposerImpl$updateValue$2(obj, groupSlotIndex));
    }

    public final void updateCachedValue(Object obj) {
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        record(new ComposerImpl$recordSideEffect$1(effect));
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i) {
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i > 0) {
                if (this.reader.groupKey(i) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(i), ComposerKt.getCompositionLocalMap())) {
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = this.providerUpdates.get(i);
                    if (persistentCompositionLocalMap2 == null) {
                        Object groupAux2 = this.reader.groupAux(i);
                        Intrinsics.checkNotNull(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                i = this.reader.parent(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue<?>[] values) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        Intrinsics.checkNotNullParameter(values, "values");
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        startGroup(203, ComposerKt.getProviderValues());
        PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) ActualJvm_jvmKt.invokeComposableForResult(this, new ComposerImpl$startProviders$currentProviders$1(values, currentCompositionLocalScope));
        endGroup();
        boolean z = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, persistentCompositionLocalMap);
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap3 = (PersistentCompositionLocalMap) groupGet2;
            if (!getSkipping() || !Intrinsics.areEqual(persistentCompositionLocalMap3, persistentCompositionLocalMap)) {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, persistentCompositionLocalMap);
                z = !Intrinsics.areEqual(updateProviderMapGroup, persistentCompositionLocalMap2);
            } else {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap2;
            }
        }
        if (z && !getInserting()) {
            this.providerUpdates.set(this.reader.getCurrentGroup(), updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z;
        this.providerCache = updateProviderMapGroup;
        m2863startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m2875getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            recordSlotTableOperation$default(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, null);
        }
        this.reader.startGroup();
    }

    /* renamed from: start-BaiHCIY  reason: not valid java name */
    private final void m2863startBaiHCIY(int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i, obj, obj2);
        boolean z = i2 != GroupKind.Companion.m2875getGroupULZAiWs();
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(i, Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i, obj3, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i, obj3);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z, null);
            return;
        }
        boolean z2 = !(i2 != GroupKind.Companion.m2876getNodeULZAiWs()) && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z2 && groupKey == i && Intrinsics.areEqual(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i, obj);
            if (!z2 && next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new ComposerImpl$start$2(groupIndex));
                }
                startReaderGroup(z, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(i, Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i, obj3, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i, obj3);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z, pending);
    }

    private final void enterGroup(boolean z, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i, boolean z) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i;
    }

    private final void end(boolean z) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        int i2 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = keyInfos.get(i3);
                if (!fastToSet.contains(keyInfo)) {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i2);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i4 < size) {
                        KeyInfo keyInfo2 = used.get(i4);
                        if (keyInfo2 != keyInfo) {
                            int nodePositionOf = pending.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (nodePositionOf != i5) {
                                int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                list = used;
                                recordMoveNode(pending.getStartIndex() + nodePositionOf, i5 + pending.getStartIndex(), updatedNodeCountOf);
                                pending.registerMoveNode(nodePositionOf, i5, updatedNodeCountOf);
                            } else {
                                list = used;
                            }
                        } else {
                            list = used;
                            i3++;
                        }
                        i4++;
                        i5 += pending.updatedNodeCountOf(keyInfo2);
                        used = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i6 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i6, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                registerInsertUpFixup();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (z) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int i, int i2) {
        int updatedNodeCount = updatedNodeCount(i);
        if (updatedNodeCount != i2) {
            int i3 = i2 - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i != -1) {
                int updatedNodeCount2 = updatedNodeCount(i) + i3;
                updateNodeCount(i, updatedNodeCount2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        Pending peek = this.pendingStack.peek(i4);
                        if (peek != null && peek.updateNodeCount(i, updatedNodeCount2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.reader.getParent();
                } else if (this.reader.isNode(i)) {
                    return;
                } else {
                    i = this.reader.parent(i);
                }
            }
        }
    }

    private final int nodeIndexOf(int i, int i2, int i3, int i4) {
        int parent = this.reader.parent(i2);
        while (parent != i3 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i4 = 0;
        }
        if (parent == i2) {
            return i4;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i2)) + i4;
        loop1: while (i4 < updatedNodeCount && parent != i) {
            parent++;
            while (parent < i) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i >= groupSize) {
                    i4 += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i4;
    }

    private final int updatedNodeCount(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i2 = iArr[i]) < 0) ? this.reader.nodeCount(i) : i2;
    }

    private final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) != i2) {
            if (i < 0) {
                HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.nodeCountVirtualOverrides = hashMap;
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                ArraysKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int i, int i2, int i3) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i, i2, i3);
        while (i > 0 && i != nearestCommonRootOf) {
            if (slotReader.isNode(i)) {
                recordUp();
            }
            i = slotReader.parent(i);
        }
        doRecordDownsFor(i2, nearestCommonRootOf);
    }

    private final void doRecordDownsFor(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i), i2);
        if (this.reader.isNode(i)) {
            recordDown(nodeAt(this.reader, i));
        }
    }

    private final int compoundKeyOf(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i);
        return groupCompoundKeyPart == 126665345 ? groupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(i), i2, i3), 3) ^ groupCompoundKeyPart;
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                return groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !Intrinsics.areEqual(groupAux, Composer.Companion.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl scope, Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, obj);
        return true;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.groupNodeCount == 0) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        if (this.groupNodeCount == 0) {
            if (getInserting()) {
                return;
            }
            if (!z) {
                skipReaderToGroupEnd();
                return;
            }
            int currentGroup = this.reader.getCurrentGroup();
            int currentEnd = this.reader.getCurrentEnd();
            for (int i = currentGroup; i < currentEnd; i++) {
                if (this.reader.isNode(i)) {
                    Object node = this.reader.node(i);
                    if (node instanceof ComposeNodeLifecycleCallback) {
                        record(new ComposerImpl$deactivateToEndGroup$2(node));
                    }
                }
                this.reader.forEachData$runtime_release(i, new ComposerImpl$deactivateToEndGroup$3(this, i));
            }
            ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
            this.reader.reposition(currentGroup);
            this.reader.skipToGroupEnd();
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int i) {
        m2863startBaiHCIY(i, null, GroupKind.Companion.m2875getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    private final void addRecomposeScope() {
        Invalidation removeLocation;
        RecomposeScopeImpl recomposeScopeImpl;
        if (!getInserting()) {
            removeLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
            Object next = this.reader.next();
            if (Intrinsics.areEqual(next, Composer.Companion.getEmpty())) {
                ControlledComposition composition = getComposition();
                Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition);
                updateValue(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            }
            recomposeScopeImpl.setRequiresRecompose(removeLocation != null);
            this.invalidateStack.push(recomposeScopeImpl);
            recomposeScopeImpl.start(this.compositionToken);
            return;
        }
        ControlledComposition composition2 = getComposition();
        Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition2);
        this.invalidateStack.push(recomposeScopeImpl2);
        updateValue(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.compositionToken);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        Function1<Composition, Unit> end;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl pop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (pop != null) {
            pop.setRequiresRecompose(false);
        }
        if (pop != null && (end = pop.end(this.compositionToken)) != null) {
            record(new ComposerImpl$endRestartGroup$1$1(end, this));
        }
        if (pop != null && !pop.getSkipped$runtime_release() && (pop.getUsed() || this.forceRecomposeScopes)) {
            if (pop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                pop.setAnchor(anchor);
            }
            pop.setDefaultsInvalid(false);
            recomposeScopeImpl = pop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> value, Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), obj, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        r10.providerUpdates.set(r10.reader.getCurrentGroup(), r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invokeMovableContentLambda(MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        changed(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z2 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), persistentCompositionLocalMap)) {
                z2 = true;
            }
            m2863startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m2875getGroupULZAiWs(), persistentCompositionLocalMap);
            if (getInserting() && !z) {
                this.writerHasAProvider = true;
                this.providerCache = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope()));
            } else {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new ComposerImpl$invokeMovableContentLambda$1(movableContent, obj)));
                this.providersInvalid = z3;
            }
        } finally {
            endGroup();
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertMovableContentGuarded$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int insertMovableContentGuarded$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int insertMovableContentGuarded$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < anchorIndex);
        insertMovableContentGuarded$positionToParentOf(slotWriter, applier, anchorIndex);
        int insertMovableContentGuarded$currentNodeIndex = insertMovableContentGuarded$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    insertMovableContentGuarded$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                insertMovableContentGuarded$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == anchorIndex);
        return insertMovableContentGuarded$currentNodeIndex;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List collectNodesFrom;
        List list2;
        SlotTable slotTable$runtime_release2;
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function32;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list3 = this.lateChanges;
        List list4 = this.changes;
        try {
            this.changes = list3;
            function3 = ComposerKt.resetSlotsInstance;
            record(function3);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i);
                MovableContentStateReference component1 = pair.component1();
                MovableContentStateReference component2 = pair.component2();
                Anchor anchor$runtime_release2 = component1.getAnchor$runtime_release();
                int anchorIndex = component1.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                Ref.IntRef intRef = new Ref.IntRef();
                realizeUps();
                record(new ComposerImpl$insertMovableContentGuarded$1$1$1(intRef, anchor$runtime_release2));
                if (component2 == null) {
                    if (Intrinsics.areEqual(component1.getSlotTable$runtime_release(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    SlotReader openReader = component1.getSlotTable$runtime_release().openReader();
                    openReader.reposition(anchorIndex);
                    this.writersReaderDelta = anchorIndex;
                    ArrayList arrayList = new ArrayList();
                    recomposeMovableContent$default(this, null, null, null, null, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList, openReader, component1), 15, null);
                    if (!arrayList.isEmpty()) {
                        record(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(intRef, arrayList));
                    }
                    Unit unit = Unit.INSTANCE;
                    openReader.close();
                } else {
                    MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(component2);
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                        slotTable$runtime_release = component2.getSlotTable$runtime_release();
                    }
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                        anchor$runtime_release = component2.getAnchor$runtime_release();
                    }
                    collectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                    if (!collectNodesFrom.isEmpty()) {
                        record(new ComposerImpl$insertMovableContentGuarded$1$1$3(intRef, collectNodesFrom));
                        if (Intrinsics.areEqual(component1.getSlotTable$runtime_release(), this.slotTable)) {
                            int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                            updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                        }
                    }
                    record(new ComposerImpl$insertMovableContentGuarded$1$1$4(movableContentStateResolve$runtime_release, this, component2, component1));
                    SlotReader openReader2 = slotTable$runtime_release.openReader();
                    SlotReader slotReader = this.reader;
                    int[] iArr = this.nodeCountOverrides;
                    this.nodeCountOverrides = null;
                    try {
                        this.reader = openReader2;
                        int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                        openReader2.reposition(anchorIndex3);
                        this.writersReaderDelta = anchorIndex3;
                        ArrayList arrayList2 = new ArrayList();
                        List list5 = this.changes;
                        try {
                            this.changes = arrayList2;
                            list2 = list5;
                            try {
                                recomposeMovableContent(component2.getComposition$runtime_release(), component1.getComposition$runtime_release(), Integer.valueOf(openReader2.getCurrentGroup()), component2.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, component1));
                                Unit unit2 = Unit.INSTANCE;
                                this.changes = list2;
                                if (!arrayList2.isEmpty()) {
                                    record(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(intRef, arrayList2));
                                }
                                Unit unit3 = Unit.INSTANCE;
                                this.reader = slotReader;
                                this.nodeCountOverrides = iArr;
                                Unit unit4 = Unit.INSTANCE;
                                openReader2.close();
                            } catch (Throwable th) {
                                th = th;
                                this.changes = list2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            list2 = list5;
                        }
                    } catch (Throwable th3) {
                        this.reader = slotReader;
                        this.nodeCountOverrides = iArr;
                        throw th3;
                    }
                }
                function32 = ComposerKt.skipToGroupEndInstance;
                record(function32);
            }
            record(ComposerImpl$insertMovableContentGuarded$1$2.INSTANCE);
            this.writersReaderDelta = 0;
            Unit unit5 = Unit.INSTANCE;
        } finally {
            this.changes = list4;
        }
    }

    private final <R> R withChanges(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list, Function0<? extends R> function0) {
        List list2 = this.changes;
        try {
            this.changes = list;
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.changes = list2;
            InlineMarker.finallyEnd(1);
        }
    }

    private final <R> R withReader(SlotReader slotReader, Function0<? extends R> function0) {
        SlotReader slotReader2 = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = slotReader;
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.reader = slotReader2;
            this.nodeCountOverrides = iArr;
            InlineMarker.finallyEnd(1);
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj) {
        ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i & 4) != 0 ? null : num;
        List list2 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list2, function0);
    }

    private final <R> R recomposeMovableContent(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> list, Function0<? extends R> function0) {
        R r;
        boolean z = this.implicitRootStart;
        boolean z2 = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<RecomposeScopeImpl, IdentityArraySet<Object>> pair = list.get(i2);
                RecomposeScopeImpl component1 = pair.component1();
                IdentityArraySet<Object> component2 = pair.component2();
                if (component2 == null) {
                    tryImminentInvalidation$runtime_release(component1, null);
                } else {
                    Object[] values = component2.getValues();
                    int size2 = component2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj = values[i3];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        tryImminentInvalidation$runtime_release(component1, obj);
                    }
                }
            }
            if (controlledComposition != null) {
                r = (R) controlledComposition.delegateInvalidations(controlledComposition2, num != null ? num.intValue() : -1, function0);
                if (r == null) {
                }
                return r;
            }
            r = function0.invoke();
            return r;
        } finally {
            this.implicitRootStart = z;
            this.isComposing = z2;
            this.nodeIndex = i;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i, String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (this.sourceInformationEnabled) {
            m2863startBaiHCIY(i, null, GroupKind.Companion.m2875getGroupULZAiWs(), sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (this.sourceInformationEnabled) {
            end(false);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void prepareCompose$runtime_release(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                block.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (this.changes.isEmpty()) {
            if (invalidationsRequested.isNotEmpty() || (!this.invalidations.isEmpty()) || this.forciblyRecompose) {
                doCompose(invalidationsRequested, null);
                return !this.changes.isEmpty();
            }
            return false;
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.compositionToken = SnapshotKt.currentSnapshot().getId();
            this.providerUpdates.clear();
            int size = identityArrayMap.getSize();
            for (int i = 0; i < size; i++) {
                Object obj = identityArrayMap.getKeys()[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues()[i];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                Anchor anchor = recomposeScopeImpl.getAnchor();
                if (anchor == null) {
                    return;
                }
                this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
            }
            List<Invalidation> list = this.invalidations;
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda$38$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((Invalidation) t).getLocation()), Integer.valueOf(((Invalidation) t2).getLocation()));
                    }
                });
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            startRoot();
            Object nextSlot = nextSlot();
            if (nextSlot != function2 && function2 != null) {
                updateValue(function2);
            }
            ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            derivedStateObservers.add(composerImpl$derivedStateObserver$1);
            if (function2 != null) {
                startGroup(200, ComposerKt.getInvocation());
                ActualJvm_jvmKt.invokeComposable(this, function2);
                endGroup();
            } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !Intrinsics.areEqual(nextSlot, Composer.Companion.getEmpty())) {
                startGroup(200, ComposerKt.getInvocation());
                ActualJvm_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(nextSlot, 2));
                endGroup();
            } else {
                skipCurrentGroup();
            }
            derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
            endRoot();
            this.isComposing = false;
            this.invalidations.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.changes.add(function3);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeUps();
        realizeDowns();
        record(function3);
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(function3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, function3);
    }

    private final void recordSlotTableOperation(boolean z, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeOperationLocation(z);
        record(function3);
    }

    private final void realizeUps() {
        int i = this.pendingUps;
        if (i > 0) {
            this.pendingUps = 0;
            record(new ComposerImpl$realizeUps$1(i));
        }
    }

    private final void realizeDowns(Object[] objArr) {
        record(new ComposerImpl$realizeDowns$1(objArr));
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    private final void recordDown(Object obj) {
        this.downNodes.push(obj);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeOperationLocation(boolean z) {
        int parent = z ? this.reader.getParent() : this.reader.getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i > 0) {
            record(new ComposerImpl$realizeOperationLocation$2(i));
            this.writersReaderDelta = parent;
        }
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            recordSlotEditingOperation(new ComposerImpl$recordInsert$1(this.insertTable, anchor));
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        recordSlotEditingOperation(new ComposerImpl$recordInsert$2(this.insertTable, anchor, mutableList));
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.insertFixups.add(function3);
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.insertUpFixups.push(function3);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    private final void recordDelete() {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        reportFreeMovableContent(this.reader.getCurrentGroup());
        function3 = ComposerKt.removeCurrentGroupInstance;
        recordSlotEditingOperation(function3);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, boolean z, int i2) {
        List filterToRange;
        if (composerImpl.reader.hasMark(i)) {
            int groupKey = composerImpl.reader.groupKey(i);
            Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = composerImpl.reader.groupGet(i, 0);
                Anchor anchor = composerImpl.reader.anchor(i);
                filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i, composerImpl.reader.groupSize(i) + i);
                ArrayList arrayList = new ArrayList(filterToRange.size());
                int size = filterToRange.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Invalidation invalidation = (Invalidation) filterToRange.get(i3);
                    arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.recordSlotEditing();
                composerImpl.record(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl, movableContentStateReference));
                if (z) {
                    composerImpl.realizeMovement();
                    composerImpl.realizeUps();
                    composerImpl.realizeDowns();
                    int nodeCount = composerImpl.reader.isNode(i) ? 1 : composerImpl.reader.nodeCount(i);
                    if (nodeCount > 0) {
                        composerImpl.recordRemoveNode(i2, nodeCount);
                        return 0;
                    }
                    return 0;
                }
                return composerImpl.reader.nodeCount(i);
            } else if (groupKey == 206 && Intrinsics.areEqual(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet2 = composerImpl.reader.groupGet(i, 0);
                CompositionContextHolder compositionContextHolder = groupGet2 instanceof CompositionContextHolder ? (CompositionContextHolder) groupGet2 : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return composerImpl.reader.nodeCount(i);
            } else {
                return composerImpl.reader.nodeCount(i);
            }
        } else if (composerImpl.reader.containsMark(i)) {
            int groupSize = composerImpl.reader.groupSize(i) + i;
            int i4 = i + 1;
            int i5 = 0;
            while (i4 < groupSize) {
                boolean isNode = composerImpl.reader.isNode(i4);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(i4));
                }
                i5 += reportFreeMovableContent$reportGroup(composerImpl, i4, isNode || z, isNode ? 0 : i2 + i5);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                i4 += composerImpl.reader.groupSize(i4);
            }
            return i5;
        } else {
            return composerImpl.reader.nodeCount(i);
        }
    }

    private final void reportFreeMovableContent(int i) {
        reportFreeMovableContent$reportGroup(this, i, false, 0);
        realizeMovement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseMovableGroupAtCurrent(final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            if (RecomposeScopeImpl.Companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                final ControlledComposition composition = getComposition();
                RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerImpl$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
                        Intrinsics.checkNotNullParameter(scope, "scope");
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public void recordReadOf(Object value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    }

                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object obj) {
                        InvalidationResult invalidationResult;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        ControlledComposition controlledComposition = ControlledComposition.this;
                        IdentityArraySet identityArraySet = null;
                        RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition : null;
                        if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(scope, obj)) == null) {
                            invalidationResult = InvalidationResult.IGNORED;
                        }
                        if (invalidationResult == InvalidationResult.IGNORED) {
                            MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                            List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                            if (obj != null) {
                                identityArraySet = new IdentityArraySet();
                                identityArraySet.add(identityArraySet);
                            }
                            movableContentStateReference2.setInvalidations$runtime_release(CollectionsKt.plus((Collection<? extends Pair>) invalidations$runtime_release, TuplesKt.to(scope, identityArraySet)));
                            return InvalidationResult.SCHEDULED;
                        }
                        return invalidationResult;
                    }
                };
                try {
                    RecomposeScopeImpl.Companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, recomposeScopeOwner);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }

    private final void reportAllMovableContent() {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        if (this.slotTable.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                List list = this.changes;
                this.changes = arrayList;
                reportFreeMovableContent(0);
                realizeUps();
                if (this.startedGroup) {
                    function3 = ComposerKt.skipToGroupEndInstance;
                    record(function3);
                    recordEndRoot();
                }
                Unit unit = Unit.INSTANCE;
                this.changes = list;
                Unit unit2 = Unit.INSTANCE;
            } finally {
                openReader.close();
            }
        }
    }

    private final void recordReaderMoving(int i) {
        this.writersReaderDelta = i - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        Function3 function3;
        if (this.reader.getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            function3 = ComposerKt.startRootGroup;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = true;
        }
        if (parent > 0) {
            Anchor anchor = slotReader.anchor(parent);
            this.startedGroups.push(parent);
            recordSlotTableOperation$default(this, false, new ComposerImpl$recordSlotEditing$1(anchor), 1, null);
        }
    }

    private final void recordEndGroup() {
        Function3 function3;
        int parent = this.reader.getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            if (this.startedGroups.peekOr(-1) == parent) {
                this.startedGroups.pop();
                function3 = ComposerKt.endGroupInstance;
                recordSlotTableOperation$default(this, false, function3, 1, null);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    private final void recordEndRoot() {
        Function3 function3;
        if (this.startedGroup) {
            function3 = ComposerKt.endGroupInstance;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = false;
        }
    }

    private final void finalizeCompose() {
        realizeUps();
        if (this.pendingStack.isEmpty()) {
            if (this.startedGroups.isEmpty()) {
                cleanUpCompose();
                return;
            } else {
                ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        ComposerKt.composeRuntimeError("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void recordRemoveNode(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            } else if (this.previousRemove == i) {
                this.previousCount += i2;
            } else {
                realizeMovement();
                this.previousRemove = i;
                this.previousCount = i2;
            }
        }
    }

    private final void recordMoveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.previousCount;
            if (i4 > 0 && this.previousMoveFrom == i - i4 && this.previousMoveTo == i2 - i4) {
                this.previousCount = i4 + i3;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = i;
            this.previousMoveTo = i2;
            this.previousCount = i3;
        }
    }

    private final void realizeMovement() {
        int i = this.previousCount;
        this.previousCount = 0;
        if (i > 0) {
            int i2 = this.previousRemove;
            if (i2 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new ComposerImpl$realizeMovement$1(i2, i));
                return;
            }
            int i3 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            int i4 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new ComposerImpl$realizeMovement$2(i3, i4, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020'0+¢\u0006\u0002\b,H\u0010¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0010¢\u0006\u0002\b2J\u0006\u00103\u001a\u00020'J\r\u00104\u001a\u00020'H\u0010¢\u0006\u0002\b5J\r\u0010\u0011\u001a\u00020\u000fH\u0010¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0010¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020=H\u0010¢\u0006\u0002\b>J\u001d\u0010?\u001a\u00020'2\u0006\u00100\u001a\u0002012\u0006\u0010@\u001a\u00020AH\u0010¢\u0006\u0002\bBJ\u0017\u0010C\u001a\u0004\u0018\u00010A2\u0006\u00100\u001a\u000201H\u0010¢\u0006\u0002\bDJ\u001b\u0010E\u001a\u00020'2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0\nH\u0010¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0010¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0010¢\u0006\u0002\bOJ\r\u0010P\u001a\u00020'H\u0010¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0010¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0010¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020'2\u0006\u0010<\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001a8PX\u0090\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001c¨\u0006W"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", "table", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate;
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        public CompositionContextImpl(int i, boolean z) {
            MutableState mutableStateOf$default;
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), null, 2, null);
            this.compositionLocalScope$delegate = mutableStateOf$default;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        for (Set<CompositionData> set2 : set) {
                            set2.remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            setCompositionLocalScope(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(composition);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(i);
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i) {
        this.compoundKeyHash = i ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(i);
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i) {
        this.compoundKeyHash = Integer.rotateRight(i ^ getCompoundKeyHash(), 3);
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlot();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    public final void dispose$runtime_release() {
        Object beginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder = persistentCompositionLocalMap.builder();
        builder.putAll(persistentCompositionLocalMap2);
        ?? build = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        changed((Object) build);
        changed(persistentCompositionLocalMap2);
        endGroup();
        return build;
    }
}

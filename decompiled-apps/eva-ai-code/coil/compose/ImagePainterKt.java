package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import com.facebook.share.internal.ShareConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: ImagePainter.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0012\u001am\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a9\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0087\b¢\u0006\u0002\u0010\u001a*\\\b\u0002\u0010\u001b\"\u0014\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u00020\r0\b2@\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\b*>\b\u0007\u0010\u001c\"\u00020\u00012\u00020\u0001B0\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\"\b \u0012\u001e\b\u000bB\u001a\b!\u0012\f\b\"\u0012\b\b\fJ\u0004\b\b(#\u0012\b\b$\u0012\u0004\b\b(%*0\b\u0002\u0010&\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t2\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "request", "Lcoil/request/ImageRequest;", "imageLoader", "Lcoil/ImageLoader;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lkotlin/Function2;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/compose/Snapshot;", "", "Lcoil/compose/ExecuteCallback;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "ImagePainter", "Lkotlin/Deprecated;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "ImagePainter has been renamed to AsyncImagePainter.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "coil.compose.AsyncImagePainter", "expression", "AsyncImagePainter", "Snapshot", "coil-compose-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagePainterKt {
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "AsyncImagePainter", imports = {"coil.compose.AsyncImagePainter"}))
    public static /* synthetic */ void ImagePainter$annotations() {
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final AsyncImagePainter rememberImagePainter(Object obj, ImageLoader imageLoader, Composer composer, int i) {
        composer.startReplaceableGroup(699722038);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)");
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(obj, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final AsyncImagePainter rememberImagePainter(Object obj, ImageLoader imageLoader, Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, Composer composer, int i) {
        composer.startReplaceableGroup(-1913684348);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)");
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(obj, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    public static final AsyncImagePainter rememberImagePainter(Object obj, ImageLoader imageLoader, Function1<? super ImageRequest.Builder, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(1750824323);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)P(1,2)");
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ImageRequest.Builder data = new ImageRequest.Builder((Context) consume).data(obj);
        function1.invoke(data);
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(data.build(), imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    public static final AsyncImagePainter rememberImagePainter(Object obj, ImageLoader imageLoader, Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, Function1<? super ImageRequest.Builder, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(-976338607);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)P(1,2,3)");
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ImageRequest.Builder data = new ImageRequest.Builder((Context) consume).data(obj);
        function1.invoke(data);
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(data.build(), imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final AsyncImagePainter rememberImagePainter(ImageRequest imageRequest, ImageLoader imageLoader, Composer composer, int i) {
        composer.startReplaceableGroup(-2028135656);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)P(1)");
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(imageRequest, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final AsyncImagePainter rememberImagePainter(ImageRequest imageRequest, ImageLoader imageLoader, Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, Composer composer, int i) {
        composer.startReplaceableGroup(-2123088410);
        ComposerKt.sourceInformation(composer, "CC(rememberImagePainter)P(2)");
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(imageRequest, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }
}

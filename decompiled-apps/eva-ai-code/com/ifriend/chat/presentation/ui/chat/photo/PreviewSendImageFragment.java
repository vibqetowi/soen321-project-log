package com.ifriend.chat.presentation.ui.chat.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.ifriend.chat.presentation.databinding.FragmentPreviewSendImageBinding;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.ui.R;
import com.ifriend.ui.base.ImagePickerObserver;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.mvvm.FragmentBaseView;
import com.ifriend.ui.button.AppButton;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtils;
import com.redmadrobot.extensions.viewbinding.ViewBindingDelegate;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
/* compiled from: PreviewSendImageFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\u0010\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010.\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020'H\u0002J\b\u00100\u001a\u00020\fH\u0002J\b\u00101\u001a\u00020'H\u0002J\u0012\u00102\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u00105\u001a\u00020'2\u0006\u00106\u001a\u0002072\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00108\u001a\u00020'2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0016\u0010;\u001a\u00020'2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016J\b\u0010?\u001a\u00020'H\u0002J\u0010\u0010@\u001a\u00020'2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020\u0003H\u0016J\u0014\u0010E\u001a\u00020B*\u00020F2\u0006\u0010G\u001a\u00020HH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006J"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageFragment;", "Lcom/ifriend/ui/base/mvvm/FragmentBaseView;", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageViewModel;", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState;", "()V", "binding", "Lcom/ifriend/chat/presentation/databinding/FragmentPreviewSendImageBinding;", "getBinding", "()Lcom/ifriend/chat/presentation/databinding/FragmentPreviewSendImageBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "hasFlash", "", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture", "()Landroidx/camera/core/ImageCapture;", "imageCapture$delegate", "Lkotlin/Lazy;", "imagePickerObserver", "Lcom/ifriend/ui/base/ImagePickerObserver;", "isCameraInit", "value", "isFlash", "setFlash", "(Z)V", "isFront", "setFront", "viewModel", "getViewModel", "()Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "changeBackAction", "", "backAction", "Lkotlin/Function0;", "changeCamera", "changeFlash", "changeVisibility", "isPhoto", "initCamera", "initOnClickListeners", "isPlayShutterClick", "makePhoto", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "sendImage", "image", "Landroid/net/Uri;", "showErrors", "errors", "", "", "showPhotoUI", "showPreviewUI", "imageBitmap", "Landroid/graphics/Bitmap;", "showState", "state", "toBitmap", "Landroidx/camera/core/ImageProxy;", Key.ROTATION, "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewSendImageFragment extends FragmentBaseView<PreviewSendImageViewModel, PreviewSendImageState> {
    private static final String ARG_CHAT_ID = "chatId";
    private static final String ARG_IMAGE_URI = "argImageUri";
    private final ReadOnlyProperty binding$delegate;
    private boolean hasFlash;
    private final Lazy imageCapture$delegate;
    private ImagePickerObserver imagePickerObserver;
    private boolean isCameraInit;
    private boolean isFlash;
    private boolean isFront;
    private final Lazy viewModel$delegate;
    @Inject
    public ViewModelFactory viewModelFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreviewSendImageFragment.class, "binding", "getBinding()Lcom/ifriend/chat/presentation/databinding/FragmentPreviewSendImageBinding;", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showErrors(List<? extends Throwable> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
    }

    /* compiled from: PreviewSendImageFragment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageFragment$Companion;", "", "()V", "ARG_CHAT_ID", "", "ARG_IMAGE_URI", "newInstance", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageFragment;", "imageUri", "Landroid/net/Uri;", "imagePickerObserver", "Lcom/ifriend/ui/base/ImagePickerObserver;", PreviewSendImageFragment.ARG_CHAT_ID, "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ PreviewSendImageFragment newInstance$default(Companion companion, Uri uri, ImagePickerObserver imagePickerObserver, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                imagePickerObserver = null;
            }
            return companion.newInstance(uri, imagePickerObserver, str);
        }

        public final PreviewSendImageFragment newInstance(Uri uri, ImagePickerObserver imagePickerObserver, String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Bundle bundle = new Bundle();
            bundle.putParcelable(PreviewSendImageFragment.ARG_IMAGE_URI, uri);
            bundle.putString(PreviewSendImageFragment.ARG_CHAT_ID, chatId);
            PreviewSendImageFragment previewSendImageFragment = new PreviewSendImageFragment();
            previewSendImageFragment.imagePickerObserver = imagePickerObserver;
            previewSendImageFragment.setArguments(bundle);
            return previewSendImageFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPreviewSendImageBinding getBinding() {
        return (FragmentPreviewSendImageBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public PreviewSendImageViewModel getViewModel() {
        return (PreviewSendImageViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView
    public void showState(PreviewSendImageState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getImage() == null) {
            showPhotoUI();
        } else {
            showPreviewUI(state.getImage());
        }
    }

    private final void showPhotoUI() {
        changeVisibility(true);
        FragmentPreviewSendImageBinding binding = getBinding();
        binding.back.setImageResource(R.drawable.close_white);
        binding.image.setImageBitmap(null);
        changeBackAction(new PreviewSendImageFragment$showPhotoUI$1$1(this));
        if (this.isCameraInit) {
            return;
        }
        setFront(true);
    }

    private final void initCamera(final boolean z) {
        final FragmentPreviewSendImageBinding binding = getBinding();
        Context context = getContext();
        if (context == null) {
            return;
        }
        Intrinsics.checkNotNull(context);
        binding.surface.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(processCameraProvider, "getInstance(...)");
        processCameraProvider.addListener(new Runnable() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PreviewSendImageFragment.initCamera$lambda$4$lambda$3(ListenableFuture.this, z, this, binding);
            }
        }, ContextCompat.getMainExecutor(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCamera$lambda$4$lambda$3(ListenableFuture cameraProviderFuture, boolean z, PreviewSendImageFragment this$0, FragmentPreviewSendImageBinding this_with) {
        CameraSelector cameraSelector;
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        V v = cameraProviderFuture.get();
        Intrinsics.checkNotNullExpressionValue(v, "get(...)");
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) v;
        Preview build = new Preview.Builder().build();
        build.setSurfaceProvider(this_with.surface.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(build, "also(...)");
        if (z) {
            cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
        } else {
            cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        }
        Intrinsics.checkNotNull(cameraSelector);
        processCameraProvider.unbindAll();
        Camera bindToLifecycle = processCameraProvider.bindToLifecycle(this$0, cameraSelector, this$0.getImageCapture(), build);
        Intrinsics.checkNotNullExpressionValue(bindToLifecycle, "bindToLifecycle(...)");
        boolean hasFlashUnit = bindToLifecycle.getCameraInfo().hasFlashUnit();
        ImageButton flash = this_with.flash;
        Intrinsics.checkNotNullExpressionValue(flash, "flash");
        flash.setVisibility(hasFlashUnit ? 0 : 8);
        this$0.hasFlash = hasFlashUnit;
        this$0.isCameraInit = true;
    }

    private final void changeBackAction(final Function0<Unit> function0) {
        getBinding().back.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PreviewSendImageFragment.changeBackAction$lambda$6$lambda$5(Function0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeBackAction$lambda$6$lambda$5(Function0 backAction, View view) {
        Intrinsics.checkNotNullParameter(backAction, "$backAction");
        backAction.invoke();
    }

    private final void showPreviewUI(final Bitmap bitmap) {
        changeVisibility(false);
        final FragmentPreviewSendImageBinding binding = getBinding();
        binding.image.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                PreviewSendImageFragment.showPreviewUI$lambda$8$lambda$7(FragmentPreviewSendImageBinding.this, bitmap);
            }
        });
        binding.back.setImageResource(R.drawable.back_white);
        ImageButton flash = binding.flash;
        Intrinsics.checkNotNullExpressionValue(flash, "flash");
        flash.setVisibility(4);
        changeBackAction(new PreviewSendImageFragment$showPreviewUI$1$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPreviewUI$lambda$8$lambda$7(FragmentPreviewSendImageBinding this_with, Bitmap imageBitmap) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(imageBitmap, "$imageBitmap");
        this_with.image.setImageBitmap(imageBitmap);
    }

    private final void changeVisibility(boolean z) {
        FragmentPreviewSendImageBinding binding = getBinding();
        PreviewView surface = binding.surface;
        Intrinsics.checkNotNullExpressionValue(surface, "surface");
        surface.setVisibility(z ? 0 : 8);
        ImageButton makePhoto = binding.makePhoto;
        Intrinsics.checkNotNullExpressionValue(makePhoto, "makePhoto");
        makePhoto.setVisibility(z ? 0 : 8);
        ImageButton changeCamera = binding.changeCamera;
        Intrinsics.checkNotNullExpressionValue(changeCamera, "changeCamera");
        changeCamera.setVisibility(z ? 0 : 8);
        if (this.hasFlash) {
            ImageButton flash = binding.flash;
            Intrinsics.checkNotNullExpressionValue(flash, "flash");
            flash.setVisibility(z ? 0 : 8);
        }
        ImageView image = binding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        image.setVisibility(z ? 4 : 0);
        AppButton send = binding.send;
        Intrinsics.checkNotNullExpressionValue(send, "send");
        send.setVisibility(z ? 4 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
        ((AppActivity) activity).getDaggerComponent().inject(this);
        super.onCreate(bundle);
    }

    @Override // com.ifriend.ui.base.mvvm.FragmentBaseView, com.ifriend.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Bitmap bitmap = null;
        Uri uri = arguments != null ? (Uri) arguments.getParcelable(ARG_IMAGE_URI) : null;
        if (uri != null) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            bitmap = uIUtils.toBitmap(uri, requireContext);
        }
        getViewModel().setImage(bitmap);
        initOnClickListeners();
    }

    private final void sendImage(Uri uri) {
        Bitmap bitmap;
        PreviewSendImageViewModel viewModel = getViewModel();
        if (uri != null) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            bitmap = uIUtils.toBitmap(uri, requireContext);
        } else {
            bitmap = null;
        }
        viewModel.setImage(bitmap);
    }

    private final void initOnClickListeners() {
        FragmentPreviewSendImageBinding binding = getBinding();
        Modification modification = Modification.INSTANCE;
        ImageButton back = binding.back;
        Intrinsics.checkNotNullExpressionValue(back, "back");
        modification.onTouchOpacity(back);
        Modification modification2 = Modification.INSTANCE;
        AppButton send = binding.send;
        Intrinsics.checkNotNullExpressionValue(send, "send");
        modification2.onTouchOpacity(send);
        binding.send.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PreviewSendImageFragment.initOnClickListeners$lambda$14$lambda$10(PreviewSendImageFragment.this, view);
            }
        });
        Modification modification3 = Modification.INSTANCE;
        ImageButton makePhoto = binding.makePhoto;
        Intrinsics.checkNotNullExpressionValue(makePhoto, "makePhoto");
        modification3.onTouchOpacity(makePhoto);
        binding.makePhoto.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PreviewSendImageFragment.initOnClickListeners$lambda$14$lambda$11(PreviewSendImageFragment.this, view);
            }
        });
        Modification modification4 = Modification.INSTANCE;
        ImageButton flash = binding.flash;
        Intrinsics.checkNotNullExpressionValue(flash, "flash");
        modification4.onTouchOpacity(flash);
        binding.flash.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PreviewSendImageFragment.initOnClickListeners$lambda$14$lambda$12(PreviewSendImageFragment.this, view);
            }
        });
        Modification modification5 = Modification.INSTANCE;
        ImageButton changeCamera = binding.changeCamera;
        Intrinsics.checkNotNullExpressionValue(changeCamera, "changeCamera");
        modification5.onTouchOpacity(changeCamera);
        binding.changeCamera.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PreviewSendImageFragment.initOnClickListeners$lambda$14$lambda$13(PreviewSendImageFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$14$lambda$10(PreviewSendImageFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context == null) {
            return;
        }
        PreviewSendImageViewModel viewModel = this$0.getViewModel();
        String string = this$0.requireArguments().getString(ARG_CHAT_ID, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        viewModel.send(context, string);
        this$0.getRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$14$lambda$11(PreviewSendImageFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.makePhoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$14$lambda$12(PreviewSendImageFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeFlash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOnClickListeners$lambda$14$lambda$13(PreviewSendImageFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeCamera();
    }

    private final ImageCapture getImageCapture() {
        return (ImageCapture) this.imageCapture$delegate.getValue();
    }

    private final void makePhoto() {
        if (isPlayShutterClick()) {
            new MediaActionSound().play(0);
        }
        getImageCapture().m153lambda$takePicture$3$androidxcameracoreImageCapture(new Executor() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new ImageCapture.OnImageCapturedCallback() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$makePhoto$2
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy image) {
                Bitmap bitmap;
                Intrinsics.checkNotNullParameter(image, "image");
                PreviewSendImageViewModel viewModel = PreviewSendImageFragment.this.getViewModel();
                bitmap = PreviewSendImageFragment.this.toBitmap(image, image.getImageInfo().getRotationDegrees());
                viewModel.setImage(bitmap);
                image.close();
                super.onCaptureSuccess(image);
            }
        });
    }

    private final boolean isPlayShutterClick() {
        Object systemService = requireContext().getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return (audioManager != null ? audioManager.getRingerMode() : 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap toBitmap(ImageProxy imageProxy, int i) {
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
        Matrix matrix = new Matrix();
        if (this.isFront) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postRotate(i * (this.isFront ? -1.0f : 1.0f));
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final void setFlash(boolean z) {
        final int i;
        if (this.hasFlash) {
            this.isFlash = z;
            getImageCapture().setFlashMode(z ? 1 : 2);
            if (z) {
                i = com.ifriend.chat.presentation.R.drawable.flash;
            } else {
                i = com.ifriend.chat.presentation.R.drawable.flash_off;
            }
            getBinding().flash.post(new Runnable() { // from class: com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageFragment$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    PreviewSendImageFragment._set_isFlash_$lambda$17(PreviewSendImageFragment.this, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_isFlash_$lambda$17(PreviewSendImageFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().flash.setImageResource(i);
    }

    private final void changeFlash() {
        setFlash(!this.isFlash);
    }

    private final void setFront(boolean z) {
        this.isFront = z;
        initCamera(z);
    }

    private final void changeCamera() {
        setFront(!this.isFront);
    }

    public PreviewSendImageFragment() {
        super(com.ifriend.chat.presentation.R.layout.fragment_preview_send_image);
        PreviewSendImageFragment previewSendImageFragment = this;
        this.binding$delegate = new ViewBindingDelegate(previewSendImageFragment, Reflection.getOrCreateKotlinClass(FragmentPreviewSendImageBinding.class));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new PreviewSendImageFragment$special$$inlined$viewModels$default$2(new PreviewSendImageFragment$special$$inlined$viewModels$default$1(previewSendImageFragment)));
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(previewSendImageFragment, Reflection.getOrCreateKotlinClass(PreviewSendImageViewModel.class), new PreviewSendImageFragment$special$$inlined$viewModels$default$3(lazy), new PreviewSendImageFragment$special$$inlined$viewModels$default$4(null, lazy), new PreviewSendImageFragment$viewModel$2(this));
        this.imageCapture$delegate = LazyKt.lazy(new PreviewSendImageFragment$imageCapture$2(this));
        this.isFront = true;
    }
}

package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: classes2.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private AudioAttributes audioAttributes;
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;
    private Parameters parameters;
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = Ordering.from(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
        }
    });
    private static final Ordering<Integer> NO_ORDER = Ordering.from(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int i, int i2) {
            this.delegate.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int i, int i2) {
            this.delegate.setMinVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int i, int i2, boolean z) {
            this.delegate.setViewportSize(i, i2, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
            this.delegate.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean z) {
            this.delegate.setForceLowestBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
            this.delegate.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
            this.delegate.setTrackTypeDisabled(i, z);
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z) {
            this.delegate.setTunnelingEnabled(z);
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
            this.delegate.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        public ParametersBuilder setRendererDisabled(int i, boolean z) {
            this.delegate.setRendererDisabled(i, z);
            return this;
        }

        @Deprecated
        public ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
            return this.delegate.build();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Parameters extends TrackSelectionParameters implements Bundleable {
        public static final Bundleable.Creator<Parameters> CREATOR;
        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final int FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = 1006;
        private static final int FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1015;
        private static final int FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = 1004;
        private static final int FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = 1005;
        private static final int FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = 1009;
        private static final int FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1014;
        private static final int FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = 1001;
        private static final int FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = 1002;
        private static final int FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = 1016;
        private static final int FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NCESSARY = 1003;
        private static final int FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = 1007;
        private static final int FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = 1000;
        private static final int FIELD_RENDERER_DISABLED_INDICES = 1013;
        private static final int FIELD_SELECTION_OVERRIDES = 1012;
        private static final int FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = 1010;
        private static final int FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = 1011;
        private static final int FIELD_TUNNELING_ENABLED = 1008;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        /* loaded from: classes2.dex */
        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.keyForField(1000), parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.keyForField(1001), parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.keyForField(1002), parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.keyForField(1014), parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.keyForField(1003), parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.keyForField(1004), parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.keyForField(1005), parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.keyForField(1006), parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.keyForField(1015), parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.keyForField(1016), parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.keyForField(1007), parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.keyForField(1008), parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.keyForField(1009), parameters.allowMultipleAdaptiveSelections));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.keyForField(1013)));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            public Builder setExceedVideoConstraintsIfNecessary(boolean z) {
                this.exceedVideoConstraintsIfNecessary = z;
                return this;
            }

            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.allowVideoMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.allowVideoNonSeamlessAdaptiveness = z;
                return this;
            }

            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeType(String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguage(String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            public Builder setExceedAudioConstraintsIfNecessary(boolean z) {
                this.exceedAudioConstraintsIfNecessary = z;
                return this;
            }

            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.allowAudioMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.allowAudioMixedSampleRateAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.allowAudioMixedChannelCountAdaptiveness = z;
                return this;
            }

            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeType(String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.constrainAudioChannelCountToDeviceCapabilities = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguage(String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.exceedRendererCapabilitiesIfNecessary = z;
                return this;
            }

            public Builder setTunnelingEnabled(boolean z) {
                this.tunnelingEnabled = z;
                return this;
            }

            public Builder setAllowMultipleAdaptiveSelections(boolean z) {
                this.allowMultipleAdaptiveSelections = z;
                return this;
            }

            public Builder setRendererDisabled(int i, boolean z) {
                if (this.rendererDisabledFlags.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.rendererDisabledFlags.put(i, true);
                } else {
                    this.rendererDisabledFlags.delete(i);
                }
                return this;
            }

            @Deprecated
            public Builder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides(int i) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Parameters build() {
                return new Parameters(this);
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void setSelectionOverridesFromBundle(Bundle bundle) {
                ImmutableList fromBundleList;
                SparseArray fromBundleSparseArray;
                int[] intArray = bundle.getIntArray(Parameters.keyForField(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.keyForField(1011));
                if (parcelableArrayList == null) {
                    fromBundleList = ImmutableList.of();
                } else {
                    fromBundleList = BundleableUtil.fromBundleList(TrackGroupArray.CREATOR, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.keyForField(1012));
                if (sparseParcelableArray == null) {
                    fromBundleSparseArray = new SparseArray();
                } else {
                    fromBundleSparseArray = BundleableUtil.fromBundleSparseArray(SelectionOverride.CREATOR, sparseParcelableArray);
                }
                if (intArray == null || intArray.length != fromBundleList.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (TrackGroupArray) fromBundleList.get(i), (SelectionOverride) fromBundleSparseArray.get(i));
                }
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }
        }

        static {
            Parameters build = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = build;
            DEFAULT = build;
            CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.Bundleable.Creator
                public final Bundleable fromBundle(Bundle bundle) {
                    DefaultTrackSelector.Parameters build2;
                    build2 = new DefaultTrackSelector.Parameters.Builder(bundle).build();
                    return build2;
                }
            };
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Deprecated
        public SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public Builder buildUpon() {
            return new Builder();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(keyForField(1000), this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1001), this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1002), this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(keyForField(1014), this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(keyForField(1003), this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1004), this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1005), this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(keyForField(1006), this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(keyForField(1015), this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(keyForField(1016), this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(keyForField(1007), this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(keyForField(1008), this.tunnelingEnabled);
            bundle.putBoolean(keyForField(1009), this.allowMultipleAdaptiveSelections);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(keyForField(1013), getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(keyForField(1010), Ints.toArray(arrayList));
                bundle.putParcelableArrayList(keyForField(1011), BundleableUtil.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(keyForField(1012), BundleableUtil.toBundleSparseArray(sparseArray2));
            }
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
                while (r4.hasNext()) {
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SelectionOverride implements Bundleable {
        public static final Bundleable.Creator<SelectionOverride> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return DefaultTrackSelector.SelectionOverride.lambda$static$0(bundle);
            }
        };
        private static final int FIELD_GROUP_INDEX = 0;
        private static final int FIELD_TRACKS = 1;
        private static final int FIELD_TRACK_TYPE = 2;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            this.type = i2;
            Arrays.sort(copyOf);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(keyForField(0), this.groupIndex);
            bundle.putIntArray(keyForField(1), this.tracks);
            bundle.putInt(keyForField(2), this.type);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ SelectionOverride lambda$static$0(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(keyForField(0), -1);
            int[] intArray = bundle.getIntArray(keyForField(1));
            int i2 = bundle.getInt(keyForField(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            Assertions.checkArgument(z);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i, intArray, i2);
        }

        private static String keyForField(int i) {
            return Integer.toString(i, 36);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof Parameters) {
            this.parameters = (Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        boolean z = context != null && Util.isTv(context);
        this.deviceIsTV = z;
        if (!z && context != null && Util.SDK_INT >= 32) {
            this.spatializer = SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            if (Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.release();
            }
        }
        super.release();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        boolean z;
        synchronized (this.lock) {
            z = !this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (z) {
            maybeInvalidateForAudioChannelCountConstraints();
        }
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    private void setParametersInternal(Parameters parameters) {
        boolean z;
        Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            z = !this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (z) {
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
                Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
            }
            invalidate();
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            parameters = this.parameters;
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.ensureInitialized(this, (Looper) Assertions.checkStateNotNull(Looper.myLooper()));
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] selectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, selectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, selectAllTracks);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                selectAllTracks[i] = null;
            }
        }
        ExoTrackSelection[] createTrackSelections = this.trackSelectionFactory.createTrackSelections(selectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            boolean z = true;
            if ((parameters.getRendererDisabled(i2) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i2)))) || (mappedTrackInfo.getRendererType(i2) != -2 && createTrackSelections[i2] == null)) {
                z = false;
            }
            rendererConfigurationArr[i2] = z ? RendererConfiguration.DEFAULT : null;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, createTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, createTrackSelections);
    }

    protected ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (selectVideoTrack != null) {
            definitionArr[((Integer) selectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) selectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (selectAudioTrack != null) {
            definitionArr[((Integer) selectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) selectAudioTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> selectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, selectAudioTrack == null ? null : ((ExoTrackSelection.Definition) selectAudioTrack.first).group.getFormat(((ExoTrackSelection.Definition) selectAudioTrack.first).tracks[0]).language);
        if (selectTextTrack != null) {
            definitionArr[((Integer) selectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) selectTextTrack.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
        return definitionArr;
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i, TrackGroup trackGroup, int[] iArr3) {
                List createForTrackGroup;
                createForTrackGroup = DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i, trackGroup, DefaultTrackSelector.Parameters.this, iArr3, iArr2[i]);
                return createForTrackGroup;
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i2, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.this.m6583xc9e179dc(parameters, z, i2, trackGroup, iArr3);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$selectAudioTrack$3$com-google-android-exoplayer2-trackselection-DefaultTrackSelector  reason: not valid java name */
    public /* synthetic */ List m6583xc9e179dc(Parameters parameters, boolean z, int i, TrackGroup trackGroup, int[] iArr) {
        return AudioTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr, z, new Predicate() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                boolean isAudioFormatWithinAudioChannelCountConstraints;
                isAudioFormatWithinAudioChannelCountConstraints = DefaultTrackSelector.this.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
                return isAudioFormatWithinAudioChannelCountConstraints;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(Format format) {
        boolean z;
        SpatializerWrapperV32 spatializerWrapperV32;
        SpatializerWrapperV32 spatializerWrapperV322;
        synchronized (this.lock) {
            z = !this.parameters.constrainAudioChannelCountToDeviceCapabilities || this.deviceIsTV || format.channelCount <= 2 || (isDolbyAudio(format) && (Util.SDK_INT < 32 || (spatializerWrapperV322 = this.spatializer) == null || !spatializerWrapperV322.isSpatializationSupported())) || (Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format));
        }
        return z;
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters, final String str) throws ExoPlaybackException {
        return selectTracksForType(3, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i, TrackGroup trackGroup, int[] iArr2) {
                List createForTrackGroup;
                createForTrackGroup = DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i, trackGroup, DefaultTrackSelector.Parameters.this, iArr2, str);
                return createForTrackGroup;
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    protected ExoTrackSelection.Definition selectOtherTrack(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (isSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i4), iArr2[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i2);
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccess;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == mappedTrackInfo2.getRendererType(i3)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.length; i4++) {
                    TrackGroup trackGroup = trackGroups.get(i4);
                    List<T> create = factory.create(i3, trackGroup, iArr[i3][i4]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i5 = 0;
                    while (i5 < trackGroup.length) {
                        T t = create.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccess = ImmutableList.of(t);
                                i2 = rendererCount;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < trackGroup.length) {
                                    T t2 = create.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                i2 = rendererCount;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((TrackInfo) list.get(i8)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            z = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
        }
        if (z) {
            invalidate();
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), trackSelectionParameters, hashMap);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, hashMap);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) hashMap.get(Integer.valueOf(mappedTrackInfo.getRendererType(i2)));
            if (trackSelectionOverride != null) {
                definitionArr[i2] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i2).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, Ints.toArray(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i = 0; i < trackGroupArray.length; i++) {
            TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i3], mappedTrackInfo.getTrackGroups(i3), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else if (i != -1) {
                    z = false;
                    break;
                } else {
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurationArr[i2] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (RendererCapabilities.CC.getTunnelingSupport(iArr[indexOf][exoTrackSelection.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    protected static boolean isSupported(int i, boolean z) {
        int formatSupport = RendererCapabilities.CC.getFormatSupport(i);
        return formatSupport == 4 || (z && formatSupport == 3);
    }

    protected static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    protected static int getFormatLanguageScore(Format format, String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(format.language)) {
            String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
            String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
            if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
                return (z && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
            } else if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
                return 3;
            } else {
                return Util.splitAtFirst(normalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(normalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                Format format = trackGroup.getFormat(i4);
                if (format.width > 0 && format.height > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z, i, i2, format.width, format.height);
                    int i5 = format.width * format.height;
                    if (format.width >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && format.height >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i5 < i3) {
                        i3 = i5;
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point getMaxVideoSizeInViewport(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
        }
        i2 = i;
        i = i2;
        int i5 = i3 * i;
        int i6 = i4 * i2;
        if (i5 >= i6) {
            return new Point(i2, Util.ceilDivide(i6, i3));
        }
        return new Point(Util.ceilDivide(i5, i4), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    private static boolean isDolbyAudio(Format format) {
        if (format.sampleMimeType == null) {
            return false;
        }
        String str = format.sampleMimeType;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        /* loaded from: classes2.dex */
        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i, TrackGroup trackGroup, int[] iArr);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.format = trackGroup.getFormat(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static ImmutableList<VideoTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i2) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                int pixelCount = trackGroup.getFormat(i3).getPixelCount();
                builder.add((ImmutableList.Builder) new VideoTrackInfo(i, trackGroup, i3, parameters, iArr[i3], i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        public VideoTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, int i4, boolean z) {
            super(i, trackGroup, i2);
            this.parameters = parameters;
            int i5 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i4 & i5) != 0;
            this.isWithinMaxConstraints = z && (this.format.width == -1 || this.format.width <= parameters.maxVideoWidth) && ((this.format.height == -1 || this.format.height <= parameters.maxVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate <= ((float) parameters.maxVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxVideoBitrate)));
            this.isWithinMinConstraints = z && (this.format.width == -1 || this.format.width >= parameters.minVideoWidth) && ((this.format.height == -1 || this.format.height >= parameters.minVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate >= ((float) parameters.minVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate >= parameters.minVideoBitrate)));
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            this.bitrate = this.format.bitrate;
            this.pixelCount = this.format.getPixelCount();
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            int i6 = 0;
            while (true) {
                if (i6 >= parameters.preferredVideoMimeTypes.size()) {
                    i6 = Integer.MAX_VALUE;
                    break;
                } else if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredVideoMimeTypes.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            this.preferredMimeTypeMatchIndex = i6;
            this.usesPrimaryDecoder = RendererCapabilities.CC.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.CC.getHardwareAccelerationSupport(i3) == 64;
            this.codecPreferenceScore = DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i3, i5);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            return (this.allowMixedMimeTypes || Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) && (this.parameters.allowVideoMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration));
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.format.roleFlags & 16384) == 0 && DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                if (this.isWithinMaxConstraints || this.parameters.exceedVideoConstraintsIfNecessary) {
                    return (!DefaultTrackSelector.isSupported(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (i & i2) == 0) ? 1 : 2;
                }
                return 0;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ComparisonChain compareFalseFirst = ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                compareFalseFirst = compareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return compareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            Ordering reverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            return ComparisonChain.start().compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), videoTrackInfo.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : DefaultTrackSelector.NO_ORDER).compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), reverse).compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), reverse).result();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            return ComparisonChain.start().compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }).compare(list.size(), list2.size()).compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }).result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static ImmutableList<AudioTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z, Predicate<Format> predicate) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add((ImmutableList.Builder) new AudioTrackInfo(i, trackGroup, i2, parameters, iArr[i2], z, predicate));
            }
            return builder.build();
        }

        public AudioTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, boolean z, Predicate<Format> predicate) {
            super(i, trackGroup, i2);
            int i4;
            int i5;
            int i6;
            this.parameters = parameters;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 >= parameters.preferredAudioLanguages.size()) {
                    i5 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                }
                i5 = DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i7), false);
                if (i5 > 0) {
                    break;
                }
                i7++;
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = i5;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            this.isDefaultSelectionFlag = (this.format.selectionFlags & 1) != 0;
            this.channelCount = this.format.channelCount;
            this.sampleRate = this.format.sampleRate;
            this.bitrate = this.format.bitrate;
            this.isWithinConstraints = (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxAudioBitrate) && (this.format.channelCount == -1 || this.format.channelCount <= parameters.maxAudioChannelCount) && predicate.apply(this.format);
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i8 = 0;
            while (true) {
                if (i8 >= systemLanguageCodes.length) {
                    i6 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                }
                i6 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i8], false);
                if (i6 > 0) {
                    break;
                }
                i8++;
            }
            this.localeLanguageMatchIndex = i8;
            this.localeLanguageScore = i6;
            int i9 = 0;
            while (true) {
                if (i9 < parameters.preferredAudioMimeTypes.size()) {
                    if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredAudioMimeTypes.get(i9))) {
                        i4 = i9;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i4;
            this.usesPrimaryDecoder = RendererCapabilities.CC.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.CC.getHardwareAccelerationSupport(i3) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i3, z);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            return (this.parameters.allowAudioMixedChannelCountAdaptiveness || (this.format.channelCount != -1 && this.format.channelCount == audioTrackInfo.format.channelCount)) && (this.parameters.allowAudioMixedMimeTypeAdaptiveness || (this.format.sampleMimeType != null && TextUtils.equals(this.format.sampleMimeType, audioTrackInfo.format.sampleMimeType))) && ((this.parameters.allowAudioMixedSampleRateAdaptiveness || (this.format.sampleRate != -1 && this.format.sampleRate == audioTrackInfo.format.sampleRate)) && (this.parameters.allowAudioMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration)));
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            Ordering reverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain compare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), this.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : DefaultTrackSelector.NO_ORDER).compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compare(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), reverse).compare(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), reverse);
            Integer valueOf = Integer.valueOf(this.bitrate);
            Integer valueOf2 = Integer.valueOf(audioTrackInfo.bitrate);
            if (!Util.areEqual(this.language, audioTrackInfo.language)) {
                reverse = DefaultTrackSelector.NO_ORDER;
            }
            return compare.compare(valueOf, valueOf2, reverse).result();
        }

        private int evaluateSelectionEligibility(int i, boolean z) {
            if (DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                if (this.isWithinConstraints || this.parameters.exceedAudioConstraintsIfNecessary) {
                    return (!DefaultTrackSelector.isSupported(i, false) || !this.isWithinConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (!this.parameters.allowMultipleAdaptiveSelections && z)) ? 1 : 2;
                }
                return 0;
            }
            return 0;
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }

        public static ImmutableList<TextTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add((ImmutableList.Builder) new TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str));
            }
            return builder.build();
        }

        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str) {
            super(i, trackGroup, i2);
            ImmutableList<String> immutableList;
            int i4;
            int i5 = 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            int i6 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i6 & 1) != 0;
            this.isForced = (i6 & 2) != 0;
            if (parameters.preferredTextLanguages.isEmpty()) {
                immutableList = ImmutableList.of("");
            } else {
                immutableList = parameters.preferredTextLanguages;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= immutableList.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = DefaultTrackSelector.getFormatLanguageScore(this.format, immutableList.get(i7), parameters.selectUndeterminedTextLanguage);
                if (i4 > 0) {
                    break;
                }
                i7++;
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = i4;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore;
            boolean z = i4 > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore > 0);
            if (DefaultTrackSelector.isSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i5 = 1;
            }
            this.selectionEligibility = i5;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain compare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                compare = compare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return compare.result();
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SpatializerWrapperV32 {
        private Handler handler;
        private Spatializer$OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new SpatializerWrapperV32(spatializer);
        }

        private SpatializerWrapperV32(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.spatializer = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.spatializationSupported = immersiveAudioLevel != 0;
        }

        public void ensureInitialized(final DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new Spatializer$OnSpatializerStateChangedListener(this) { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                Handler handler = new Handler(looper);
                this.handler = handler;
                Spatializer spatializer = this.spatializer;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ConcurrencyHelpers$$ExternalSyntheticLambda1(handler), this.listener);
            }
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public boolean isAvailable() {
            boolean isAvailable;
            isAvailable = this.spatializer.isAvailable();
            return isAvailable;
        }

        public boolean isEnabled() {
            boolean isEnabled;
            isEnabled = this.spatializer.isEnabled();
            return isEnabled;
        }

        public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
            boolean canBeSpatialized;
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.getAudioTrackChannelConfig((MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount));
            if (format.sampleRate != -1) {
                channelMask.setSampleRate(format.sampleRate);
            }
            canBeSpatialized = this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
            return canBeSpatialized;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.listener;
            if (spatializer$OnSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }
}

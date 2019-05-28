package frameworks.support.lottie.model.animatable;

import frameworks.support.lottie.value.Keyframe;
import frameworks.support.lottie.animation.keyframe.TextKeyframeAnimation;
import frameworks.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}

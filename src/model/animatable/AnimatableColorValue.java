package frameworks.support.lottie.model.animatable;

import frameworks.support.lottie.value.Keyframe;
import frameworks.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import frameworks.support.lottie.animation.keyframe.ColorKeyframeAnimation;

import java.util.List;

public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
  public AnimatableColorValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new ColorKeyframeAnimation(keyframes);
  }
}

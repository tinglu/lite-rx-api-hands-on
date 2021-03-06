package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import io.pivotal.literx.repository.ReactiveUserRepository;
import reactor.core.publisher.Mono;
import reactor.util.context.Context;

/**
 * Learn about Context.
 *
 * @author Julien Hoarau
 * @see reactor.util.context.Context
 * @see Mono#subscriberContext(Context)
 */
public class Part17Context {

  private ReactiveUserRepository userRepository = new ReactiveUserRepository();

  // TODO Modify userRepository.findById to log the following message
  // "Found user {userId} in {cloudId}" without changing userRepository.findById signature.
  // and pass the context when calling findById
  public Mono<User> addContext() {
    return userRepository.findById(User.SKYLER.getUsername());
  }

}

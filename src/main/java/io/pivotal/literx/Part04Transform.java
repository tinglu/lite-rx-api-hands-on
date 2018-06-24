package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to transform values.
 *
 * @author Sebastien Deleuze
 */
public class Part04Transform {

  // ========================================================================================

  // TODO Switch user username, firstName and lastName to uppercase
  Mono<User> capitalizeOne(Mono<User> mono) {
    return null;
  }

  // ========================================================================================

  // TODO Switch the users username, firstName and lastName to uppercase
  Flux<User> capitalizeMany(Flux<User> flux) {
    return null;
  }

  // ========================================================================================

  // TODO Switch the users username, firstName and lastName to uppercase using #asyncUserToUppercase
  Flux<User> asyncCapitalizeMany(Flux<User> flux) {
    return null;
  }

  // ========================================================================================

  // TODO Filter out user with firstName starting with the letter 'S'.
  Flux<User> filterNameStartingWithS(Flux<User> flux) {
    return null;
  }

  Mono<User> asyncUserToUppercase(User u) {
    return Mono.just(
        new User(
            u.getUsername().toUpperCase(),
            u.getFirstName().toUpperCase(),
            u.getLastName().toUpperCase()))
        .delayElement(Duration.ofMillis(100));
  }
}

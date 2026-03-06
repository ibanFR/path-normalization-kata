# Path Normalization Kata

Write a test list for a function that takes a relative path as a string and returns its normalized equivalent. A path
may contain "." and ".." with the usual meanings.

## Java Project

This repository includes a Java project in the `java` folder, configured with Maven:

- Standard Maven structure (`src/main/java`, `src/test/java`)
- JUnit 5 and AssertJ for testing
- Java 25 as the target version
- Build and test using Maven commands (`mvn clean install`, `mvn test`)

## GitHub Actions Workflows

- **Site Deployment:** `.github/workflows/pages.yml` builds and deploys the documentation site to GitHub Pages.
- **Java Build & Test:** `.github/workflows/java-build-test.yml` automatically builds and tests the Java project on push and pull request events. Test results are uploaded as artifacts.

## Building and previewing your site locally

Assuming [Jekyll] and [Bundler] are installed on your computer:

1. Change your working directory to the root directory of your site.
2. Run `bundle install`.
3. Run `bundle exec jekyll serve` to build your site and preview it at `localhost:4000`.

The built site is stored in the directory `docs/_site`.

## Licensing and Attribution

This repository uses the [Just the Docs] theme for static site generation. A copy of their [MIT License] is included in
the `docs/` folder.

The deployment GitHub Actions workflow is heavily based on GitHub's mixed-party [starter workflows]. A copy of their MIT
License is available in [actions/starter-workflows].

All documentation content within the `docs/` folder is authored by Iván Fernández and licensed under
the [Creative Commons Attribution-ShareAlike 4.0 International (CC BY-SA 4.0) License].

You are generally free to reuse or extend upon the code in this repository as you see fit, provided you comply with the
terms of the respective licenses for the code and documentation.



[Jekyll]: https://jekyllrb.com
[Just the Docs]: https://just-the-docs.github.io/just-the-docs/
[GitHub Pages / Actions workflow]: https://github.blog/changelog/2022-07-27-github-pages-custom-github-actions-workflows-beta/
[Bundler]: https://bundler.io
[MIT License]: https://en.wikipedia.org/wiki/MIT_License
[starter workflows]: https://github.com/actions/starter-workflows/blob/main/pages/jekyll.yml
[actions/starter-workflows]: https://github.com/actions/starter-workflows/blob/main/LICENSE
[Creative Commons Attribution-ShareAlike 4.0 International (CC BY-SA 4.0) License]: https://creativecommons.org/licenses/by-sa/4.0/

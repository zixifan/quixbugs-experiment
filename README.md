## Automatic repair experiment on QuixBugs.

This experiment is to evaluate effectiveness of two representative automatic repair tools Astor and Nopol on repairing [QuixBugs](https://github.com/jkoppel/QuixBugs) benchmark. QuixBugs is a benchmark suite of 40 confirmed bugs from classic algorithms with a bug on a single line of code. Before we start our experiment, we did some [preperation work](https://github.com/jkoppel/QuixBugs/pulls?q=is%3Apr+is%3Aclosed) to contribute QuixBugs as a usable repair benchmark in Java programs.

In our experiment, we focus on two parts:

```

# How many QuixBugs programs could be repaired by two considered tools?

# How to assess the correctness of generated patches?

```



### Folder Structure

[Buggy Java Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/buggy_java_programs) are 40 buggy programs from QuixBugs and Corresponding [Junit Tests](https://github.com/KTH/quixbugs-experiment/tree/master/src/test/java/buggy_java_programs)

[Reference Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/java_programs) are the ground truth version based on the provided correct Python version from QuixBugs.

[Patches](https://github.com/KTH/quixbugs-experiment/tree/master/patches) contains all patches generated by Astor and Nopol.

[Evosuite Tests and InputSampling Tests](https://github.com/KTH/quixbugs-experiment/tree/master/generatedTests) are the independent tests generated based reference programs, to assess patches generated by Astor and Nopol. 

[Patch Correctness Assessment](https://github.com/KTH/quixbugs-experiment/tree/master/patches_assessment_report) are the assessment reports of each patch when runing different number tests.


### Getting started

##### Check out the project:

```
git clone https://github.com/KTH/quixbugs-experiment.git
cd quixbugs-experiment
mvn clean install -DskipTests
cd ..
```

##### Class to generate tests by InputSampling
```
simpletest.generator.InputSampling
```


##### Class to generate tests by Evosuite

```
simpletest.generator.QuixBugExtendedOracle

```

##### Patch correctness assessment:

To assess patches ,for example, by using 30 Evosuite test suites:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#testResultsByRunning30Seeds

```
To assess patches ,for example, by using 300 InputSampling tests:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#inputSampling_300_assessment
```



#### Preconditions

Some programs of QuixBugs have preconditions that constrain the input domain. It is important to clear about the preconditions when sampling the input domain for genereating tests in InputSampling.

| program | preconditions|
| --- |---|
|depth_first_search||
|find_in_sorted|a sorted list of ints|
|get_factors|n int greater than 1|
|is_valid_parenthesization|paren in '()'|
|knapsack||
|levenshtein||
|lis|the ints in arr are unique|
|mergesort||
|next_permutation|perm is not sorted in reverse order|
|powerset|array has no duplicate elements|
|quicksort|the ints in arr are unique|
|rpn_eval|token in ('+', '-', '*', '/')|

#### Failing Evosuite Tests

Evosuite generates test cases that fail on the version used for generating them, more information [here](https://github.com/KTH/quixbugs-experiment/issues/1). These failing tests will result in incorrect patch assessment result. To address this problem, we first run all Evosuite test over corresponding the referecen program (using [this](https://github.com/KTH/quixbugs-experiment/blob/master/src/test/java/qfevotest/generator/PatchAssessmentTest.java#L228) method to check), then manually remove the failing tests. 

| program | reason|
| --- |---|
|find_in_sorted|Undeclared exception |
|get_factors|Undeclared exception|
|knapsack |Undeclared exception|
|levenshtein| Undeclared exception|
|next_permutation|Undeclared exception|
|shortest_path_lengths|Undeclared exception|


#### Tests to prove manual analysis of patch correctness
While manual analysis of patch correctness, if a patch is considered as incorrect, the author must show a test that the same input would have two different ouputs between patch program and reference program.

|program| Input | Output from reference program | Output from patched program|
| --- |---| --- |---|
|find_in_sorted| [21,33,45,67,69,70], 100|-1|3|
|next_permutation|[1,3,2,2,1,3,1] |[1,3,2,2,3,1,1]|[1,3,2,2,1,1,3]|
|get_factors| 0 | | Arithmetical exception|

## Test Coverage 
[Evosuite](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/Evosuite/index.html)

[InputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSampling/index.html)

[EvosuiteAndInputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSamplingAndEvosuite/index.html)

[original_tests](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/original_tests/index.html)




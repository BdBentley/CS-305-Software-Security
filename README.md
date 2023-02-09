# CS-305-Software-Security
Software Security Repository for CS-305 Professor Conlan


Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial was was a client that tasked us with developing secure software. The client dealt with international financial transactions and required us to develop in ecplise using java and the springboot framework. This client would require us to secure their server traffic as well as checking for software vulnerabilities.

What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? 

We were able to find our clients software vulnerabilities by utilizing the maven dependency check framework. Testing the software outputs a dependency report with links to NIST articles on the different depency vulnerabilities found. We were able to identify that the dependencies and modules for this application all required some form of updating. We were also able to properly suppress false positives for developers.

What value does software security add to a company’s overall wellbeing?

Software security is paramount to a company's status as being a dependable and secure place to do business. Complacency in security has led to massive changes in trust between consumers and customers and led to billions in losses.

What part of the vulnerability assessment was challenging or helpful to you?

It was helpful to be able to check dependencies in an automated fashion and figure out which were deprecated or outdated. It enables us to potentially automate updates in the future by applying patches as soon as vulnerabilities are found. You can run a nightly or daily report and update the DevOps team.

How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

We included checksums for the server, created and published certificates, as well as encrypting data with SHA-256. We specifically chose SHA-256 since it is collision resistant. 

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

We would run the same maven tests on our software after refactoring the applications code. We would also run and debug the server, making sure that our data was properly showing up. We also would verify that the checksum could be seen after running the application.

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Dynamic testing, website checksums, creating and modifying certificates, encrypting data and traffic. These are all useful in future tasks. It was also a good chance to refactor code in new ways.

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

That if we are developing in java or the springboot framework that we understand how to secure our software. We also should be able to show that we were successful in refactoring this code. This is imperative in showing our employers that we care about code quality and security.

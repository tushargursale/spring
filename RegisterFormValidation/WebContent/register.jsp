<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
<html>
<head>
<style type="text/css">
body {
    background-color: #eee;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    background-color: #fff;
    border-radius: 0.3em;
}

*[role="form"] h2 {
    margin-left: 5em;
    margin-bottom: 1em;
}

</style>




<div class="container">
            <f:form class="form-horizontal" role="form" action="second" commandName="student">
                <h2>Registration Form</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Full Name</label>
                    <div class="col-sm-9">
                        <f:input placeholder="Full Name" class="form-control" path="fname"/> 
                        <f:errors path="fname"></f:errors>
                        <span class="help-block">Last Name, First Name, eg.: Tushar , Rohan</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <f:input  placeholder="Email" class="form-control" path="email"/>
                        <f:errors path="email"></f:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <f:password type="password" placeholder="Password" class="form-control" path="password"/>
                        <f:errors path="password"></f:errors>
                    </div>
                </div>
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                    <div class="col-sm-9">
                        <f:input type="date" id="birthDate" class="form-control" path="bdate" />
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="country" class="col-sm-3 control-label">Country</label>
                    <div class="col-sm-9">
                        <f:select  class="form-control" path="country">
                            <option>Select Country</option>
                            <option>India</option>
                            <option>USA</option>
                            <option>California</option>
                            <option>Denmark</option>
                            <option>Japan</option>
                            <option>China</option>
                            <option>Rashia</option>
                            
                        </f:select>
                        <f:errors path="country"></f:errors>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <f:input type="radio" id="femaleRadio" value="Female" path="gender"/>Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                     <f:input type="radio" id="maleRadio" value="Male" path="gender"/>Male
                                </label>
                            </div>
                            
                        </div>
                    </div>
            
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <input type="submit" class="btn btn-primary btn-block" value="register11">
                    </div>
                </div>
            </f:form> <!-- /form -->
        </div> <!-- ./container -->
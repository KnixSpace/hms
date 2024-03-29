require("dotenv").config();
function ensureAuthentiated(req, res, next) {
  if (req.isAuthenticated()) {
    return next();
  }
  res.redirect(process.env.CLIENT_HOME);
}

module.exports.ensureAuthentiated = ensureAuthentiated;

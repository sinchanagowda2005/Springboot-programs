function Navbar() {
  return (
    <>
      <div className="flex justify-between px-12 py-7">
        <div className="flex gap-5">
          <div>SkyExplorer</div>
        </div>

        <div className="flex gap-6">
          <div>Features</div>
          <div>Method</div>
          <div>Pricing</div>
          <div>Changelog</div>
        </div>

        <div className="flex">
          <button className="px-4 py-2 bg-blue-600 text-white rounded-lg hover:bg-blue-700">
            Log in
          </button>
        </div>
      </div>
    </>
  );
}
export default Navbar;
